package com.interviewprep.questionbankservice.questionbank;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface QuestionBankRepository extends CrudRepository<Question, Integer> {

	public List<Question> findByCategory(String category);
	
}
