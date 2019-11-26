package com.springboot.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class LogDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -863435008869701565L;
	String requestData;
	String applyNo;
	String request;
	String response;
	
	
}
