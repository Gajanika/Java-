package com.example.Data.DAO;

import org.springframework.data.repository.CrudRepository;
import com.example.Data.model.StuDetails;

public interface StuDAO extends CrudRepository<StuDetails, Integer> {
}