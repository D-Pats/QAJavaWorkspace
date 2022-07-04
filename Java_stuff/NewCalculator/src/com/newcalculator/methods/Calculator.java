package com.newcalculator.methods;

import java.util.Scanner;

public class Calculator {
	// Attributes
//	private int num1;
//	private int num2;
//	private String operator;

	// Default Constructor
	public Calculator() {
	}

	// Everything Constructor
//	public Calculator(int num1, int num2, String operator) {
//		this.num1 = num1;
//		this.num2 = num2;
//		this.operator = operator;
//	}
	Scanner calc = new Scanner(System.in);
	
	public void runCalc() {

		System.out.println("First number: ");
		double num1 = calc.nextDouble();

		System.out.println("Second number: ");
		double num2 = calc.nextDouble();

		calc.nextLine();

		System.out.println("operator of choice (+, -, /, *)");
		String operator = calc.next();

		switch (operator) {
		case "+":
			System.out.println("Result: " + (num1 + num2));
			break;
		case "-":
			System.out.println("Result: " + (num1 - num2));
			break;
		case "*":
			System.out.println("Result: " + (num1 * num2));
			break;
		case "/":
			System.out.println("Result: " + (num1 / num2));
		}
	}

}
