package com.example.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Employee.DAO.StuDAO;
import com.example.Employee.Model.StuDetails;

@Controller
public class StuController {

    @Autowired
    StuDAO studao;

    @GetMapping("/")
    public String loadForm() {
        return "index";  // loads src/main/resources/templates/index.html
    }

    @PostMapping("/addStu")
    public String saveStudent(@ModelAttribute StuDetails studetails) {
        studao.save(studetails);
        return "index";
    }
}
