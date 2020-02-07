package com.interviewprep.questionbankservice.questionbank;

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


@Controller
@RequestMapping("/questionBank")
public class QuestionBankController {
	
	@Autowired
	QuestionBankRepository questionBankRepository;
	
	
	@GetMapping("get/category/{category}")
	@ResponseBody
	public List<Question> getAllQuestionsbyCategory(@PathVariable String category){		
		return questionBankRepository.findByCategory(category);	
	}
	
	@GetMapping("/get")
	@ResponseBody
	public Optional<Question> getQuestion(@RequestParam int id){
		return questionBankRepository.findById(id);
	}
	
	@PostMapping("/add")
	@ResponseBody
	public Question addQuestion(@RequestBody Question question){
		return questionBankRepository.save(question);	
	}
		

}
