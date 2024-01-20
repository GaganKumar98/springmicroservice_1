package com.bank.account.dto;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponseDto {

	private String apiPath;

	private HttpStatus errorCod;

	private String errorMessage;

	private LocalDateTime errorTime;

	public String getApiPath() {
		return apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
	}

	public HttpStatus getErrorCod() {
		return errorCod;
	}

	public void setErrorCod(HttpStatus errorCod) {
		this.errorCod = errorCod;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public LocalDateTime getErrorTime() {
		return errorTime;
	}

	public void setErrorTime(LocalDateTime errorTime) {
		this.errorTime = errorTime;
	}

	public ErrorResponseDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ErrorResponseDto(String apiPath, HttpStatus errorCod, String errorMessage, LocalDateTime errorTime) {
		super();
		this.apiPath = apiPath;
		this.errorCod = errorCod;
		this.errorMessage = errorMessage;
		this.errorTime = errorTime;
	}

	@Override
	public String toString() {
		return "ErrorResponseDto [apiPath=" + apiPath + ", errorCod=" + errorCod + ", errorMessage=" + errorMessage
				+ ", errorTime=" + errorTime + "]";
	}

}
