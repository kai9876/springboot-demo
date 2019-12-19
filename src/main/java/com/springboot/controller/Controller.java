package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.service.HelloServiceClient;

@RestController
public class Controller {
	@Autowired
	HelloServiceClient helloServiceClient;

	@GetMapping("/hello")
	public String hello(@RequestParam String name) {
		return helloServiceClient.hello(name);
	}

}
