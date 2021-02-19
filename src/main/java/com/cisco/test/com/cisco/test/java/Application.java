package com.cisco.test.com.cisco.test.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	@GetMapping("/")
	public static String home(){
		return "Hello! My First AWS Deployment !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
