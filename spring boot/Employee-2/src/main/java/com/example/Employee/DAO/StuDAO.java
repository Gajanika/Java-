package com.example.Employee.DAO;

import org.springframework.data.repository.CrudRepository;

import com.example.Employee.Model.StuDetails;

public interface StuDAO  extends CrudRepository <StuDetails,Integer>{
             
}
