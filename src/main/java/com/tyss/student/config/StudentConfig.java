package com.tyss.student.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tyss.student.dto.StudentPrimaryInfo;
import com.tyss.student.dto.StudentSecondaryInfo;

@Configuration
public class StudentConfig {

	@Bean
	@Scope("prototype")
	public StudentSecondaryInfo getStudentSecondaryInfo() {
		StudentSecondaryInfo studentSecondaryInfo = new StudentSecondaryInfo();
		studentSecondaryInfo.setFatherName("Kumar");
		studentSecondaryInfo.setMotherName("Kumari");
		return studentSecondaryInfo;
	}
	
	@Bean
	public StudentPrimaryInfo getStudentPrimaryInfo() {
		StudentPrimaryInfo studentPrimaryInfo= new StudentPrimaryInfo();
		studentPrimaryInfo.setStudentId(100);
		studentPrimaryInfo.setStudentName("Kiran");
		studentPrimaryInfo.setSecondaryInfo(getStudentSecondaryInfo());
		return studentPrimaryInfo;
	}
	
}
