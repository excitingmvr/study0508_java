package com.mycompany.study.ch06.fifth;

public class ExCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Calculator calculator = new Calculator();
		
		double result = 10 * Calculator.pi;
		System.out.println("result: " + result);
		
		int result1 = Calculator.plus(1, 2);
		int result2 = Calculator.minus(1, 3);

//		int result1 = calculator.plus(1, 2);
//		int result2 = calculator.minus(1, 3);
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		
	}
}
