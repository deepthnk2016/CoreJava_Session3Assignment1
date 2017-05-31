package com.acadgild;

//Student Class
public class Student {
	static int counter; //Static counter to maintain the count of instances created.
	
	//Instance Variables
	private int studentId;
	private String studentName;
	
	//Setter and Getter methods
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
