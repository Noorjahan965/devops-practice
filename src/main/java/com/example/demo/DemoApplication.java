package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args); // changed something remotely
	}
	@GetMapping("/")
	public String home() {
		return "Hello from DevOps Demo App!";  // Added a comment Remotely
	}

}
