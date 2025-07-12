package com.example.Employee.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StuDetails {
  @Id
  private int  StId;
  private String fName;
  private String lName;
  private int Marks;
public StuDetails(int stId, String fName, String lName, int marks) {
	super();
	StId = stId;
	this.fName = fName;
	this.lName = lName;
	Marks = marks;
}
public StuDetails() {
	super();
}
public int getStId() {
	return StId;
}
@Override
public String toString() {
	return "StuDetails [StId=" + StId + ", fName=" + fName + ", lName=" + lName + ", Marks=" + Marks + "]";
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

}
