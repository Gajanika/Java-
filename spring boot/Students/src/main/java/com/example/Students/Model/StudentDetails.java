package com.example.Students.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StudentDetails {
	@Id
	private int  StId;
	  public StudentDetails(int stId, String fName, String lName, int marks) {
		super();
		StId = stId;
		this.fName = fName;
		this.lName = lName;
		Marks = marks;
	}
	@Override
	public String toString() {
		return "StudentDetails [StId=" + StId + ", fName=" + fName + ", lName=" + lName + ", Marks=" + Marks
				+ ", getStId()=" + getStId() + ", getfName()=" + getfName() + ", getlName()=" + getlName()
				+ ", getMarks()=" + getMarks() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getStId() {
		return StId;
	}
	public void setStId(int stId) {
		StId = stId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public StudentDetails() {
		super();
	}
	private String fName;
	  private String lName;
	  private int Marks;
}
