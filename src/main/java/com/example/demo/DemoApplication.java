package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // changed something remotely
	}
	@GetMapping("/")
	public String home() {
		return "Hello from DevOps Demo App!";  // Added a comment Remotely
	}
	@GetMapping("/status")
	public String status() {
		return "Application is running fine.";
	}

}
