package com.example.headline_test;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HeadlineTestApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(HeadlineTestApplication.class, args);
		Path currentWorkingDir = Paths.get("").toAbsolutePath();
		
		System.out.println("Root dir : "+currentWorkingDir);

	}

}
