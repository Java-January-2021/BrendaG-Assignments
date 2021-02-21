package com.brenda.dojooverflow.repositories;

import org.springframework.data.repository.CrudRepository;

import com.brenda.dojooverflow.models.Answer;

public interface AnswerRepository extends CrudRepository<Answer, Long>{
	
}