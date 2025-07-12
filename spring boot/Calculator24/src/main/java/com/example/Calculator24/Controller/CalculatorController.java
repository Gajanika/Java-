 package com.example.Calculator24.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Calculator24.Model.CalculationRequest;
import com.example.Calculator24.Model.CalculationResponse;
import com.example.Calculator24.Service.CalculatorService;

@CrossOrigin
@Controller
@RequestMapping("/api/calculator")

	
	public class CalculatorController{
	    @Autowired
	    private CalculatorService service;

	    @GetMapping("/")
	    public String calculator() {
	        return "index"; // Loads index.html from static folder
	    }

	    @PostMapping("/calculate")
	    @ResponseBody
	    public CalculationResponse calculate(@RequestBody CalculationRequest request) {
	        return service.calculate(request);
	    }
	}


