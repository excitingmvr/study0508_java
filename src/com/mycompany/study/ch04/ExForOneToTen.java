package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 10까지 더하는 프로그램 작성
		// 

		int sum = 0;
//		int sum;
		
		for(int i=1; i<=10; i++){
			sum = sum + i;	 
			System.out.println("i: " + i + " | sum: " + sum);
		}

		// 11~50까지 짝수의 합을 구하시요
	    int sum2 = 0;
	    
	    for (int j = 11; j <= 50; j++) {
	    	if (j % 2 == 0) {
	    		sum2 += j;
	    		System.out.println(j + " | " + sum2);
	    	}
	    }
		
		
		
		
	}

}
