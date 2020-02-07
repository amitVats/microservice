package com.interviewprep.questionbankservice.questionbank;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.interviewprep.questionbankservice.questionoption.QuestionOptions;
import com.sun.istack.NotNull;

@Entity
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int questionId;
	
	@NotNull
	String question;
	
	@NotNull
	String category;
	
	@OneToOne(targetEntity=QuestionOptions.class,cascade=CascadeType.ALL)
	QuestionOptions questionOptions;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public QuestionOptions getQuestionOptions() {
		return questionOptions;
	}

	public void setQuestionOptions(QuestionOptions questionOptions) {
		this.questionOptions = questionOptions;
	}
	
	
	
	
	

}
