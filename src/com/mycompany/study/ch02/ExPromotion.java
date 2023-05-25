package com.mycompany.study.ch02;

public class ExPromotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		byte < short < int < long < float < double
		
		byte byteVar = 10;
		System.out.println("byteVar: " + byteVar);
		
		short shortVar = byteVar;
		System.out.println("shortVar: " + shortVar);

		int intVar = shortVar;
		System.out.println("intVar: " + intVar);
		
		long longtVar = intVar;
		System.out.println("longtVar: " + longtVar);
		
		float floatVar = longtVar;
		System.out.println("floatVar: " + floatVar);
		
		double doubleVar = floatVar;
		System.out.println("doubleVar: " + doubleVar);
		
		
	}

}
