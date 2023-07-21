package com.devops.demo.cicddemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello to the world of Devops";
	}

	@GetMapping("/welcome")
	public String hello() {
		return "welcome to the world of Devops";
	}
}
