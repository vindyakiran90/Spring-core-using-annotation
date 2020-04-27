package com.tyss.student.controller;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.student.config.StudentConfig;
import com.tyss.student.dto.StudentPrimaryInfo;

public class StudentController {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(StudentConfig.class);
		StudentPrimaryInfo primaryInfo = context.getBean(StudentPrimaryInfo.class);
		System.out.println("-------------Student Information-------------");
		System.out.println("Id "+primaryInfo.getStudentId());
		System.out.println("Name "+primaryInfo.getStudentName());
		System.out.println("Mother Name "+primaryInfo.getSecondaryInfo().getMotherName());
		System.out.println("Father Name "+primaryInfo.getSecondaryInfo().getFatherName());
	}
	
}
