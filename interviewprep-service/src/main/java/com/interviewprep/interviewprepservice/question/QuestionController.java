package com.interviewprep.interviewprepservice.question;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;



@Controller
@RequestMapping("/question")
public class QuestionController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("get/category/{category}")
	@ResponseBody
	public List<Question> getAllQuestionsbyCategory(@PathVariable String category){	
		
		QuestionList list = restTemplate.getForObject("http://questionbank-service/questionBank/get/category/{category}", QuestionList.class,category);
		return list.getQuestionList();
	}
	
	@GetMapping("/get")
	@ResponseBody
	public Question getQuestion(@RequestParam int id){	
	    return restTemplate.getForObject("http://questionbank-service/questionBank/get?id={id}", Question.class, id);		
	}
	
	@PostMapping("/add")
	@ResponseBody
	public Question addQuestion(@RequestBody Question question){
		
		return restTemplate.postForObject("http://questionbank-service/questionBank/add", question, Question.class);
		
	}
	


}
