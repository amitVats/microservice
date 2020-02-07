package com.interviewprep.questionbankservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class QuestionbankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionbankServiceApplication.class, args);
	}

}
