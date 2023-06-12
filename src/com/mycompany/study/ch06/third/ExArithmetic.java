package com.mycompany.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Car car = new Car();
		
		Arithmetic arithmetic = new Arithmetic();
		
		int result = arithmetic.add(1, 1);
		System.out.println("result: " + result);
	
		String result2 = arithmetic.changeName("장원영");
		System.out.println("result2: " + result2);
		
		arithmetic.prettyWonyoungChang("아이브");
		
		int result3 = arithmetic.taken();
		System.out.println("result3: " + result3);
	}

}
