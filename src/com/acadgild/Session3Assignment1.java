package com.acadgild;


/**
 * 
 * @author Deepak
 * @descr  Program to display the difference between
 * 		   static and instance variables.
 */
public class Session3Assignment1 {
	
	public static void main(String[] args) {
		
		//initialize the static variable counter
		Student.counter=1;
		
		//create two instances of student class
		createStudent(1,"Deepak");
		createStudent(2,"Sweta");
		
	}
	
	static void createStudent(int studid,String studName){
		
		//instantiate a instance of Student class
		Student stud=new Student();
		
		//Set the values of the instance variables
		stud.setStudentId(studid);
		stud.setStudentName(studName);
		
		//Print the values of instance variables
		System.out.println("Student Details - through instance variables");
		System.out.println("Student Id		::"+stud.getStudentId());
		System.out.println("Student Name		::"+stud.getStudentName());
		System.out.println("");
		
		//Print the number of students created through static variable
		System.out.println("No. of students created (static counter) = "+Student.counter);
		System.out.println("*********************************************");
		
		//Increment the static counter
		Student.counter++;
	}

}
