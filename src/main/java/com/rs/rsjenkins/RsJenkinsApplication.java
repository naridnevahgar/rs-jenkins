package com.rs.rsjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RsJenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsJenkinsApplication.class, args);
	}

	@GetMapping("/")
	public String greet() {
		return "Hello, your SB app works!";
	}
}
