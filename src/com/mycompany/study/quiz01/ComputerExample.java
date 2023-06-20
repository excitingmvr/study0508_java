package com.mycompany.study.quiz01;

public class ComputerExample {

	public static void main(String[] args) {

		int r = 7;
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		System.out.println("원의 반지름: " + r);
		System.out.println();
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행: " + r);
		System.out.println("원 면적: " + calculator.circleArea(r));
		System.out.println();
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행: " + r);
		System.out.println("원 면적: " + computer.circleArea(r));
		
	}

}
