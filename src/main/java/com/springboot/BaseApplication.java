package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = {"classpath:/application.yaml"})
@ServletComponentScan
public class BaseApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(BaseApplication.class, args);
	}

}
