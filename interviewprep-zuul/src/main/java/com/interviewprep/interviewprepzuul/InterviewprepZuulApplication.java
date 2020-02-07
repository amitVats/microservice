package com.interviewprep.interviewprepzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class InterviewprepZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(InterviewprepZuulApplication.class, args);
	}

}
