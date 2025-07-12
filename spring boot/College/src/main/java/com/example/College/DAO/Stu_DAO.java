package com.example.College.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.College.Model.Student_Details;

public interface Stu_DAO extends CrudRepository <Student_Details,Integer> {
	

}
