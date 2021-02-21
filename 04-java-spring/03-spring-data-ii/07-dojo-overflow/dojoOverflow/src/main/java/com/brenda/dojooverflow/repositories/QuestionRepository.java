package com.brenda.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.brenda.dojooverflow.models.Question;

public interface QuestionRepository extends CrudRepository<Question, Long>{
	List<Question> findAll();
}