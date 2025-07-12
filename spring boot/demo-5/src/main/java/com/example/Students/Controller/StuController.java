package com.example.Students.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.Students.DAO.dao;
import com.example.Students.Model.StuDetaill;

@Controller
public class StuController {

    @Autowired
    dao Stu;

    @GetMapping("home")
    public ModelAndView intpage() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("studetails", new StuDetaill()); // To avoid null
        return mav;
    }

    @PostMapping("saveStu")
    public ModelAndView AddRecord(@ModelAttribute StuDetaill studetails) {
        Stu.save(studetails);
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("studetails", new StuDetaill());
        return mav;
    }
    @GetMapping("getstu")
    public ModelAndView getstudent(@RequestParam int id) {
        ModelAndView mav = new ModelAndView("index");
        StuDetaill studetails = Stu.findById(id).orElse(new StuDetaill());
        mav.addObject("studetails", studetails);
        return mav;
    }
    @GetMapping("deletestu")
    public ModelAndView deletestudetails(@RequestParam int id) {
        Stu.deleteById(id);
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("studetails", new StuDetaill());
        return mav;
    }
    

    @GetMapping("getnost")
    public ModelAndView getnostaff() {
        ModelAndView mav1 = new ModelAndView("staffdetails");
        long stno = Stu.count();
        mav1.addObject("staffCount", stno);
        return mav1;
    }
}
