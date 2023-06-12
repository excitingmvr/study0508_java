package com.mycompany.study.ch04;

public class ExForHigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1.  (10*5)
//		**********
//		**********
//		**********
//		**********
//		**********
//		출력하는 프로그램을 만드시요
		
//2. (1,10번째 출력)		
//		**********
//		*               *
//		*               *
//		*               *
//		**********
//		출력하는 프로그램을 만드시요
		
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
//		for(int i=1; i<=5; i++) {
//			System.out.println("**********");
//		}
//		
//		System.out.println("----------------------------");
//
//		for(int i=1; i<=5; i++) {
//			if(i > 1 & i <= 4 ) {
//				System.out.println("*        *");
//			}else {
//				System.out.println("**********");	
//			}
//		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if(i>=2 && i<=4) {
					if(j>=2 && j<=9) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.println("-------------------");
		
		
//		1
//		12
//		123
//		1234
//		12345
//		123456
//		1234567
//		12345678
//		123456789
//		1 3 5 7 90
//		출력하는 프로그램을 만드시요		
		
		for (int i=1; i<=10; i++) {
			for (int j=1; j<i; j++) {
				System.out.print(j);
			} 
			System.out.println();
		} 
		
		for (int k=1; k<6; k++) {
			System.out.print(k * 2 - 1);
			System.out.print(" ");
		}	
		System.out.println(0);
		
		System.out.println("---------");
		
		
		
		//3 
		for(int i=1; i<=10; i++) {
			if(i == 10) {
				for(int j=1; j<=i-1; j++) {
					if(j%2==1) {
						System.out.print(j);
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("0");
			} else {
				for(int j=1; j<=i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		
		// 윤미진
		for (int i=1; i<=10; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(j);
			}
			System.out.println(i);
		}
		
	}

}
