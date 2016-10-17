package com.cisc181.core;

import static org.junit.Assert.*;



import java.util.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.*;
import com.cisc181.core.*;

public class Staff_Test {
	
	Date date1 = new Date(1998, 9, 27);
	Date date2 = new Date(2000, 11, 10);
	Date date3 = new Date(1900, 12, 25);
	Date date4 = new Date(19000, 1200, 200);
	Date date5 = new Date(20000, 200, 150);
	
	final Staff staff1 = new Staff("Jess", "Marie", "Williams", date1, "123 Williams Way", "111-111-1112", "Ashley.Marie.Williams@Gmail.com",
			"11 - 2PM", 1, 12000.00, date2, eTitle.MS);
	final Staff staff2 = new Staff("Reinaldo", "California", "Dimsun", date3, "623 Hollywood Drive", "786-342-1312", "CaliforniaMan@aol.com",
			"3 - 5pm", 2, 500000.00, date2, eTitle.MR);
	final Staff staff3 = new Staff("Timothy", "Young", "Louie", date1, "111 Home Drive", "732-404-7488", "tttim@yahoo.com",
			"6 - 8pm", 3, 120000.00, date2, eTitle.MR);
	final Staff staff4 = new Staff("Garry", "Homer", "Gordonson", date3, "569 Canada Avenue", "105-324-5602", "GarryHGordonson@Gmail.com",
			"12 - 3pm", 4, 60000.00, date2, eTitle.MR);
	final Staff staff5 = new Staff("Randle", "Rick", "Ronson", date3, "137 Rickson Road", "404-293-5692", "TripleR@yahoo.com",
			"8 - 10am", 5, 75000.00, date1, eTitle.MR);
	final Staff staff6 = new Staff("Jess", "Marie", "Williams", date4, "123 Williams Way", "1111112", "Ashley.Marie.Williams@Gmail.com",
			"11 - 2PM", 1, 12000.00, date2, eTitle.MS);
	final Staff staff7 = new Staff("Reinaldo", "California", "Dimsun", date5, "623 Hollywood Drive", "7-42-1312", "CaliforniaMan@aol.com",
			"3 - 5pm", 2, 500000.00, date2, eTitle.MR);
	final Staff staff8 = new Staff("Timothy", "Young", "Louie", date4, "111 Home Drive", "732488", "tttim@yahoo.com",
			"6 - 8pm", 3, 120000.00, date2, eTitle.MR);
	final Staff staff9 = new Staff("Garry", "Homer", "Gordonson", date5, "569 Canada Avenue", "102602", "GarryHGordonson@Gmail.com",
			"12 - 3pm", 4, 60000.00, date2, eTitle.MR);
	final Staff staff10 = new Staff("Randle", "Rick", "Ronson", date4, "137 Rickson Road", "4045692", "TripleR@yahoo.com",
			"8 - 10am", 5, 75000.00, date1, eTitle.MR);
	

ArrayList<Staff> staffList = new ArrayList<Staff>() {{
	add(staff1);
	add(staff2);
	add(staff3);
	add(staff4);
	add(staff5);
}};


ArrayList<Staff> invalidStaffList = new ArrayList<Staff>() {{
	add(staff6);
	add(staff7);
	add(staff8);
	add(staff9);
	add(staff10);
}};
	
	
	@BeforeClass
	public static void setup() {
		
	}
	
	@Test
	public void averageSalarytest() {
		double averageSalary = (staffList.get(0).getSalary() + staffList.get(1).getSalary() + staffList.get(2).getSalary()
				+ staffList.get(3).getSalary() + staffList.get(4).getSalary()) / 5; 
		assertEquals(averageSalary, 153400.00, .1);
	}
	
	@Test
	public void averageSalarytestFail() {
		String exceptionThrow = (invalidStaffList.get(0).getPhone());
		assertEquals(exceptionThrow, "invalid phone number", .1);
	}

}
