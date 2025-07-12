package com.example.College.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student_Details {
	@Id
    private int stuId;
	private String fname;
    private String lname;
    private int Marks;
    
    public Student_Details(int stuId, String fname, String lname, int marks) {
		super();
		this.stuId = stuId;
		this.fname = fname;
		this.lname = lname;
		Marks = marks;
	}
    public Student_Details() {
		super();
	}
    public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
    @Override
	public String toString() {
		return "Student_Details [stuId=" + stuId + ", fname=" + fname + ", lname=" + lname + ", Marks=" + Marks + "]";
	}
	
	
	
	
}

    