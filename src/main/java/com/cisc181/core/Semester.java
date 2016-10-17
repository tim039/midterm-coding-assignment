package com.cisc181.core;

import java.util.*;

public class Semester {

	public UUID semesterId;
	public Date startDate;
	public Date endDate;
	
	
	public Semester(UUID setSemesterId, Date setStartDate, Date setEndDate) {
		semesterId = setSemesterId;
		startDate = setStartDate;
		endDate = setEndDate;
	}
	
	public UUID getSemesterId(){ 
		return semesterId;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setSemesterId(UUID semesterId) {
		this.semesterId = semesterId;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
