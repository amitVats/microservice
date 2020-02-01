package com.interviewprep.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InterviewprepServer {

	public static void main(String[] args) {
		SpringApplication.run(InterviewprepServer.class, args);
	}

}
