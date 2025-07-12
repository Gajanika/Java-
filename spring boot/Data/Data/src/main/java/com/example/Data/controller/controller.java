package com.example.Data.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.Data.DAO.StuDAO;
import com.example.Data.model.StuDetails;

@Controller
public class controller {
    
    @Autowired
    private StuDAO stuDao;

    @RequestMapping("index")
    public String pageLoad() {
        return "index.html";
    }

    @RequestMapping("addStu")
    public String addStudent(StuDetails student) {
        stuDao.save(student) ;
        return "index.html";
    }
} 