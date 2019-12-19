package com.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceClientFallback implements HelloServiceClient {

	@Override
	public String hello() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hello(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hello(String name, Integer age) {
		// TODO Auto-generated method stub
		return null;
	}

}
