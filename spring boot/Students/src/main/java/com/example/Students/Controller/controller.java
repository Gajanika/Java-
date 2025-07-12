package com.example.Students.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

	 @RequestMapping("index")
	 public String pageLoad() {
		 return "index.html";
	 }
	 
}
