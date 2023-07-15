package com.jwtpractice.jwttokenpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JwtTokenPracticeApplication {

	public static void main(String[] args) {

		SpringApplication.run(JwtTokenPracticeApplication.class, args);
		System.out.println("Server is running on port 8000");

	}

}
