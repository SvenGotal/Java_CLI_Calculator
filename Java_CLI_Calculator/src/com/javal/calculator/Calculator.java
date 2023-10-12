package com.javal.calculator;

public class Calculator {
	
	private Double operand1;
	private Double operand2;
	private String operator;
	private Double result;
	
	public Calculator(Double operand1, String operator, Double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
		this.operator = operator;
		
		calculate();
	}

	public Calculator(String equation) {
		
	}
			
	public Double result() {
		return this.result;
	}
	
	private void calculate() {
		
		switch(operator) {
		case "+":
			this.result = addition();
			break;
		case "-":
			this.result = subtraction();
			break;
		case "*":
			this.result = multiplication();
			break;
		case "/":
			this.result = division();
			break;
		default:
			this.result = 0.0;
				
		}		
	}
	
	private Double addition() {
		return operand1 + operand2;
	}
	
	private Double subtraction() {
		return operand1 - operand2;
	}
	
	private Double multiplication() {
		return operand1 * operand2;
	}
	
	private Double division() {
		return operand1 / operand2;
	}
	
}
