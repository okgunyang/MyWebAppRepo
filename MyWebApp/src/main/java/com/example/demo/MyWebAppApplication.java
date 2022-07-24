package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyWebAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyWebAppApplication.class, args);
	}
	@RequestMapping(value="/")
	public String home() {
		return "Spring Boot Started";
	}
}
