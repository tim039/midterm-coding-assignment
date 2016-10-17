package com.cisc181.core;

import java.util.*;

public class Enrollment {

	UUID sectionId;
	UUID studentId;
	UUID enrollmentId;
	double grade;
	
	
	public Enrollment(UUID sectionId, UUID studentId, UUID enrollmentId, double grade) {	
	this.sectionId = sectionId;
	this.studentId = studentId;
	this.enrollmentId = enrollmentId;
	this.grade = grade;
	}
	
	private Enrollment() {
	}
	
	public Enrollment(UUID studentId, UUID sectionId) {
		this.enrollmentId = enrollmentId;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
}
