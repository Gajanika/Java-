package com.example.Students.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.Students.Model.StudentDetails;



public interface StuDAO  extends CrudRepository <StudentDetails,Integer> {

}
