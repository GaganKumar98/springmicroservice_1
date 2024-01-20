package com.bank.account.dto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class CustomerDto {

	private String name;

	private String email;

	private String mobileNumber;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(String name, String email, String mobileNumber) {
		super();
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "CustomerDto [name=" + name + ", email=" + email + ", mobileNumber=" + mobileNumber + "]";
	}

}
