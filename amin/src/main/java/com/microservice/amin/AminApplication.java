package com.microservice.amin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@SpringBootApplication
public class AminApplication {

	@GetMapping("/weatherforecast")
	public String getMessage() {
		return "Today is a great sunny day for a Java service";
	}
	public static void main(String[] args) {
		SpringApplication.run(AminApplication.class, args);
	}

}
