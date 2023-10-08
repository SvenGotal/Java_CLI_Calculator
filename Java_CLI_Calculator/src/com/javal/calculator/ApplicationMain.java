/*
 * Console-Based Calculator: Create a console-based calculator program that 
 * accepts user input for arithmetic operations (addition, subtraction, 
 * multiplication, division) and displays the results.
 * 
 * 
 * */

package com.javal.calculator;

public class ApplicationMain {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator(Double.parseDouble(args[0]), args[1], Double.parseDouble(args[2]));
		System.out.println("Result: " + Double.toString(cal.result()));

	}

}
