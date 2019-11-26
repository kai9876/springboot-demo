package com.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.LogDTO;
import com.springboot.service.LogService;

@RestController
public class TestController {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	LogService logService;

	@GetMapping(value = "/testPg")
	public String testPg() {
		List<LogDTO> list = logService.getLogInfo();
		logger.info("testPg:"+list.size());
		return "success" +list.toString();
	}
}
