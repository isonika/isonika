package com.java.student;

public class Student {

	String Name;
	int Idno;
	String Grade;
	String Address;
	
    public Student() {
		
	}

	public Student(String name, int idno, String grade, String address) {
		super();
		Name = name;
		Idno = idno;
		Grade = grade;
		Address = address;
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getIdno() {
		return Idno;
	}
	public void setIdno(int idno) {
		Idno = idno;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", Idno=" + Idno + ", Grade=" + Grade + ", Address=" + Address + "]";
	}
	
	
}
