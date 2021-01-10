package com.springmvc.example.springmvchelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


//http://127.0.0.1:7788/helloworld
@SpringBootApplication
@RestController
public class SpringmvcHelloworldApplication {

	@GetMapping(value="/helloworld")
	public String getMethodName() {
		return "helloworld";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringmvcHelloworldApplication.class, args);
	}

}