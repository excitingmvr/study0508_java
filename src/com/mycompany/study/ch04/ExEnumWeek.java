package com.mycompany.study.ch04;

public class ExEnumWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		Week week;
		String abc;
		
//		abc = Week.MONDAY;	// "MONDAY"	// error: type mismatch
		abc = Week.MONDAY.toString();	// "MONDAY"
		
//		week= Week.MONDAY;
		
		System.out.println(abc);
		
	}

}
