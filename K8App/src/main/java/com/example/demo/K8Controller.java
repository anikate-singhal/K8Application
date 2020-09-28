package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class K8Controller {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
