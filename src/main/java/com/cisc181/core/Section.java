package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section {
	
	public UUID courseId;
	public UUID semesterId;
	public UUID sectionId;
	public int roomId;
	
	
	public Section(UUID setCourseId, UUID setSemesterId, UUID setSectionId, int setRoomId) {
		courseId = setCourseId;
		semesterId = setSemesterId;
		sectionId = setSectionId;
		roomId = setRoomId;
	}
	
	public UUID getCourseId() {
		return courseId;
	}
	
	public UUID getSemesterId(){ 
		return semesterId;
	}
	
	public UUID getsectionId() {
		return sectionId;
	}
	
	public int getRoomId() {
		return roomId;
	}
	
	public void setCourseId(UUID courseId) {
		this.courseId = courseId;
	}
	
	public void setSemesterId(UUID semesterId) {
		this.semesterId = semesterId;
	}
	
	public void setSectionId(UUID sectionId) {
		this.sectionId = sectionId;
	}
	
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
}