package com.capg.exception;


import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Exception {

	private String errorMessage;
	
	private String errorcode;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yy hh:mm:ss")
	private LocalDateTime timestamp;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	
	
}
