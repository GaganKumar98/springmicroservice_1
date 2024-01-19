package com.bank.account.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@MappedSuperclass
@Getter
@Setter
@ToString
public class BaseEntity {

	@Column(updatable = false)
	public LocalDateTime createAt;
	
	@Column(updatable = false)
	public String createdBy;

	@Column(insertable = false)
	public LocalDateTime updateAt;
	
	@Column(insertable = false)
	public String updateBy;
	
}
