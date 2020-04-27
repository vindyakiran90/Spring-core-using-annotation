package com.tyss.student.dto;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class StudentPrimaryInfo {
	private int studentId;
	private String studentName;
	@Autowired
	private StudentSecondaryInfo secondaryInfo;
}
