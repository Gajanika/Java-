package com.example.Calculator11.Model;

public class CalculationResponse{
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public CalculationResponse() {
		super();
	}
	public CalculationResponse(double result, String message) {
		super();
		this.result = result;
		this.message = message;
	}
	private double result; 
	private String message; 
}
