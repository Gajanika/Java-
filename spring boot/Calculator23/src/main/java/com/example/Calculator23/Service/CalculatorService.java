package com.example.Calculator23.Service;

import org.springframework.stereotype.Service;

import com.example.Calculator23.Model.CalculationRequest;
import com.example.Calculator23.Model.CalculationResponse;

@Service
public class CalculatorService {
    public CalculationResponse calculate(CalculationRequest request) {
        double result = 0;
        String message = "Success";
        switch (request.getOperation()) {
            case "add":
                result = request.getNumber1() + request.getNumber2();
                break;
            case "subtract":
                result = request.getNumber1() - request.getNumber2();
                break;
            case "multiply":
                result = request.getNumber1() * request.getNumber2();
                break;
            case "divide":
                if (request.getNumber2() == 0) {
                    message = "Cannot divide by zero";
                } else {
                    result = request.getNumber1() / request.getNumber2();
                }
                break;
            default:
                message = "Invalid operation";
        }
        return new CalculationResponse(result, message);
    }
}


