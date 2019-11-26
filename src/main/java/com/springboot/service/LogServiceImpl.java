package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.mapper.LogMapper;
import com.springboot.dto.LogDTO;

@Service
public class LogServiceImpl implements LogService {

	@Autowired
	LogMapper logMapper;

	public List<LogDTO> getLogInfo() {
		// TODO Auto-generated method stub
		return logMapper.getLogInfo();
	}

}
