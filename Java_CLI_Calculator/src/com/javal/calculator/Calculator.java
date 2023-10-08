package com.javal.calculator;

public class Calculator {
	
	private Double operand1;
	private Double operand2;
	private String operator;
	
	public Calculator() {
		this.operand1 = 0.0;
		this.operand2 = 0.0;
		this.operator = "+";
	}
	
	public Calculator(Double operand1, String operator, Double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
	}
	
	
	
}
