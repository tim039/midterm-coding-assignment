package com.cisc181.core;

import java.util.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class personException extends Exception {

	private Person pers;
	private String phone_number;
	Date DOB;
	
	public String personException(Person pers, String phone_number, Date DOB) {
		this.pers = pers;
		this.phone_number = phone_number;
		this.DOB = DOB;
		return ("your age is wrong");
	}

	public Person getPers() {
		return pers;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public Date getDOB() {
		return DOB;
	}
	
	public void setPhone(String newPhone_number) throws personException {
		String regex = "^\\(([0-9]{3})\\)[-]([0-9]{3})[-]([0-9]{4})$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(newPhone_number);
		if (matcher.matches()) {
		phone_number = newPhone_number;
		}
		else {
		throw new personException();
		}

		}


}
