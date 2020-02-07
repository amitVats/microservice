package com.interviewprep.interviewprepservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InterviewPrepServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewPrepServiceApplication.class, args);
	}

}
