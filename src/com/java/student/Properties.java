package com.java.student;

public class Properties {

	public static void main(String[] args) {
		
		
		Student std = new Student();
		std.setName("Ram");
		std.setIdno(2);
		std.setGrade("Nine");
		std.setAddress("Kansas");
		
		Student std1 = new Student();
		std1.setName("Priya");
		std1.setIdno(3);
		std1.setGrade("Ten");
		std1.setAddress("Arkansas");
		
		System.out.println("Student Name:" + std.getName() +" ID:" + std.getIdno()+" Grade:"+ std.getGrade()+ " Address:" +std.getAddress());
		System.out.println("Student Name:" + std1.getName() +" ID:" + std1.getIdno()+" Grade:"+ std1.getGrade()+ " Address:" +std1.getAddress());
	}
	
	
}
