package com.example.Data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class StuDetails {
    @Id
    private int StId;
    private String fName;
    private String lName;
    
    // Constructors
    public StuDetails() {}
    
    public StuDetails(int stId, String fName, String lName) {
        StId = stId;
        this.fName = fName;
        this.lName = lName;
    }
    
    // Getters and Setters
    public int getStId() { return StId; }
    public void setStId(int stId) { StId = stId; }
    public String getfName() { return fName; }
    public void setfName(String fName) { this.fName = fName; }
    public String getlName() { return lName; }
    public void setlName(String lName) { this.lName = lName; }
}