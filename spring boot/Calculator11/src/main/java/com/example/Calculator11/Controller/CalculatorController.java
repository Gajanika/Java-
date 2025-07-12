package com.example.Calculator11.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

import com.example.Calculator11.Model.CalculationRequest;
import com.example.Calculator11.Model.CalculationResponse;
import com.example.Calculator11.Service.CalculatorService;

@Controller 
//@RequestMapping("/api/calculator") 
public class CalculatorController {
	@GetMapping("tata")
	public String Calculators()
	{
		return"index.html";
	}
	
	
	

	@Autowired 
	
	private CalculatorService service; 
	@PostMapping("/calculate") 
	public CalculationResponse calculate(@RequestBody CalculationRequest request) { 
	return service.calculate(request); 
	}
	
	
	
}
