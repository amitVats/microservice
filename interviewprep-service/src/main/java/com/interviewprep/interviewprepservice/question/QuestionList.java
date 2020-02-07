package com.interviewprep.interviewprepservice.question;

import java.util.ArrayList;
import java.util.List;

public class QuestionList {
	
	public List<Question> questionList;
	
    public QuestionList(){
		questionList = new ArrayList<Question>();
	} 

	public List<Question> getQuestionList() {
		return questionList;
	}

	public void setQuestionList(List<Question> questionList) {
		this.questionList = questionList;
	}

	
}
