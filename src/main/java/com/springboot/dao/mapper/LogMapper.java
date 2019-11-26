package com.springboot.dao.mapper;

import java.util.List;

import com.springboot.dto.LogDTO;

public interface LogMapper {
	List<LogDTO> getLogInfo();
}
