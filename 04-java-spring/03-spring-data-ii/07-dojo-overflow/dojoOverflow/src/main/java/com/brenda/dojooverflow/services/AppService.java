package com.brenda.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brenda.dojooverflow.models.Answer;
import com.brenda.dojooverflow.models.NewQuestion;
import com.brenda.dojooverflow.models.Question;
import com.brenda.dojooverflow.models.Tag;
import com.brenda.dojooverflow.repositories.AnswerRepository;
import com.brenda.dojooverflow.repositories.QuestionRepository;
import com.brenda.dojooverflow.repositories.TagRepository;

@Service
public class AppService {
	@Autowired
	private QuestionRepository qRepo;
	@Autowired
	private TagRepository tRepo;
	@Autowired
	private AnswerRepository aRepo;

	public List<Question> getQuestions() {
		return this.qRepo.findAll();
	}
	public Question getQuestion(Long id) {
		return this.qRepo.findById(id).orElse(null);
	}
	public void createQuestion(NewQuestion question) {
		// TODO: make a real question here
		List<Tag> questionsTags = new ArrayList<Tag>();
		for(String subject: question.splitTags()) {
			Tag tag = this.tRepo.findBySubject(subject).orElse(null);
			if(tag == null) {
				tag = new Tag(subject);
				this.tRepo.save(tag);
			}
			// prevent dupe tags
			if(!questionsTags.contains(tag))
				questionsTags.add(tag);
		}
		Question newQuestion = new Question(question.getQuestion(), questionsTags);
		this.qRepo.save(newQuestion);
	}
	public Answer createAnswer(Answer answer) {
		return this.aRepo.save(answer);
	}
}