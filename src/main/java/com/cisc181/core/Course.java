package com.cisc181.core;

import java.util.*;

public class Course {
	
	private UUID courseId;
	private String courseName;
	private int gradePoints;
	
	
	public Course(UUID setCourseId, String setCourseName, int setGradePoints) {
		courseId = setCourseId;
		courseName = setCourseName;
		gradePoints = setGradePoints;
	}
	
	public UUID getCourseId(){ 
		return courseId;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getGradePoints() {
		return gradePoints;
	}
	
	public void setCourseId(UUID courseId) {
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setGradePoints(int gradePoints) {
		this.gradePoints = gradePoints;
	}
}
