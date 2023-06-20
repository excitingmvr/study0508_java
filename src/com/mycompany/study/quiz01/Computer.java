package com.mycompany.study.quiz01;

public class Computer extends Calculator{
	
	@Override
	public double circleArea(double r) {
		
		return r * r * Constants.PAI_2;
	
	}

}
