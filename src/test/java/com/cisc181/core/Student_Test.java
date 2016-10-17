package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.*;
import com.cisc181.core.*;


public class Student_Test {

	private UUID courseId1 = UUID.randomUUID();	
	private UUID courseId2 = UUID.randomUUID();
	private UUID courseId3 = UUID.randomUUID();
	
	 final Course course1 = new Course(courseId1, "Hist", 28);
	 final Course course2 = new Course(courseId2, "Math", 56);
	 final Course course3 = new Course(courseId3, "English", 72);
	 
	 ArrayList<Course> Courses = new ArrayList<Course>() {{
		 add(course1);
		 add(course2);
		 add(course3);
	 }};
	 
	 private UUID semesterId1 = UUID.randomUUID();
	 private UUID semesterId2 = UUID.randomUUID();
	 
	 	Date date1 = new Date(1998, 9, 27);
		Date date2 = new Date(2000, 11, 10);
		Date date3 = new Date(1900, 12, 25);
	 
	 final Semester fallSemester = new Semester(semesterId1, date1, date2);
	 final Semester springSemester = new Semester(semesterId1, date3, date1);
	 
	 ArrayList<Semester> Semesters = new ArrayList<Semester>() {{
		add(fallSemester);
		add(springSemester);
	 }};
	 
	 	private UUID sectionId1 = UUID.randomUUID();	
		private UUID sectionId2 = UUID.randomUUID();
	 
	 final Section section1 = new Section(courseId1, semesterId1, sectionId1, 100);
	 final Section section2 = new Section(courseId1, semesterId1, sectionId2, 101);
	 final Section section3 = new Section(courseId2, semesterId1, sectionId1, 100);
	 final Section section4 = new Section(courseId2, semesterId2, sectionId2, 101);
	 final Section section5 = new Section(courseId3, semesterId2, sectionId1, 100);
	 final Section section6 = new Section(courseId3, semesterId2, sectionId2, 101);
	 
	 ArrayList<Section> Sections = new ArrayList<Section>() {{
		add(section1);
		add(section2);
		add(section3);
		add(section4);
		add(section5);
		add(section6);
	 }};
	 
	 
	 final Student student1 = new Student("Jess", "Marie", "Williams", date1, eMajor.BUSINESS,
			 "123 Williams Way", "111-111-1112", "Ashley.Marie.Williams@Gmail.com");
	 final Student student2 = new Student("Reinaldo", "California", "Dimsun", date3, eMajor.CHEM, "623 Hollywood Drive",
			 "786-342-1312", "CaliforniaMan@aol.com");
	 final Student student3 = new Student("Timothy", "Young", "Louie", date1, eMajor.COMPSI, "111 Home Drive",
			 "732-404-7488", "tttim@yahoo.com");
	 final Student student4 = new Student("Garry", "Homer", "Gordonson", date3, eMajor.NURSING, "569 Canada Avenue",
			 "105-324-5602", "GarryHGordonson@Gmail.com");
	 final Student student5 = new Student("Randle", "Rick", "Ronson", date3, eMajor.PHYSICS, "137 Rickson Road",
			 "404-293-5692", "TripleR@yahoo.com");
	 final Student student6 = new Student("Karen", "Flax", "Seedly", date2, eMajor.PHYSICS, "145 Flaxley Way",
			 "123-444-1212", "FLax@Gmail.com");
	 final Student student7 = new Student("Joe", "Act", "Ready", date1, eMajor.COMPSI, "222 Joe Way",
			 "123-453-1512", "Joe@Gmail.com");
	 final Student student8 = new Student("Mary", "May", "Mason", date2, eMajor.COMPSI, "135 ahfdj Way",
			 "444-423-1512", "Joe@Gmail.com");
	 final Student student9 = new Student("Adam", "Link", "Trains", date1, eMajor.PHYSICS, "333 Whiteboard Avenue",
			 "123-444-1512", "AAA@Gmail.com");
	 final Student student10 = new Student("Fred", "Dianne", "Krueger", date2, eMajor.CHEM, "1 Marlbury Road",
			 "122-555-3234", "FredFred@Gmail.com");
	 
	 
	 ArrayList<Student> Students = new ArrayList<Student>() {{
		 	add(student1);
			add(student2);
			add(student3);
			add(student4);
			add(student5);
			add(student6);
			add(student7);
			add(student8);
			add(student9);
			add(student10);
	 }};
	 
	 	private UUID StudentId1 = UUID.randomUUID();	
	 	private UUID StudentId2 = UUID.randomUUID();
	 	private UUID StudentId3 = UUID.randomUUID();
	 	private UUID StudentId4 = UUID.randomUUID();
	 	private UUID StudentId5 = UUID.randomUUID();
	 	private UUID StudentId6 = UUID.randomUUID();
	 	private UUID StudentId7 = UUID.randomUUID();
	 	private UUID StudentId8 = UUID.randomUUID();
	 	private UUID StudentId9 = UUID.randomUUID();
	 	private UUID StudentId10 = UUID.randomUUID();
	 
	 final Enrollment enrollment1 = new Enrollment(sectionId1, StudentId1, sectionId1, 90);
	 final Enrollment enrollment2 = new Enrollment(sectionId1, StudentId2, sectionId1, 80);
	 final Enrollment enrollment3 = new Enrollment(sectionId1, StudentId3, sectionId2, 70);
	 final Enrollment enrollment4 = new Enrollment(sectionId1, StudentId4, sectionId2, 90);
	 final Enrollment enrollment5 = new Enrollment(sectionId1, StudentId5, sectionId1, 50);
	 final Enrollment enrollment6 = new Enrollment(sectionId1, StudentId6, sectionId2, 30);
	 final Enrollment enrollment7 = new Enrollment(sectionId1, StudentId7, sectionId1, 40);
	 final Enrollment enrollment8 = new Enrollment(sectionId1, StudentId8, sectionId1, 60);
	 final Enrollment enrollment9 = new Enrollment(sectionId1, StudentId9, sectionId2, 100);
	 final Enrollment enrollment10 = new Enrollment(sectionId1, StudentId10, sectionId2, 80);
	
	@BeforeClass
	public static void setup() {
		
	}

	@Test
	public void test() {
		
		assertEquals(1, 1);
	}
}