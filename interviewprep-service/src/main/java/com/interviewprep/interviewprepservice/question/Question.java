package com.interviewprep.interviewprepservice.question;

public class Question {
	
	String questionId;
	String question;
	String category;
	QuestionOptions questionOptions;
	
	public Question() {	}

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

	public String getQuestionId() {
		return questionId;
	}

	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}
	
	

}
