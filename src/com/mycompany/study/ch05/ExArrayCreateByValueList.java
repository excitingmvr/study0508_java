package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] scoreEnglish;
//		int scoreMath[];
//		
//		String[] name;
//		String name2[];
//		
//		double[] total;
//		double avg[];
//		
//		char[] grade232301;
//		char grade232302[];
//		
//		boolean[] score;
//		boolean score2[];
		
		int[] scoreChemistry = {100,99,98,97,96,95,94};
		
//		scoreChemistry[7] = 93;	// 컴파일 에러
		scoreChemistry[0] = 0;
		
		String[] scoreStudent = {"Tony", "Chase", "Andrew", "Meverick", "Bess"};
		char[] scoreGrade = {'A','B','C','D','F'};
		
//		int[] scorePhysics;
//		scorePhysics = {100,99,98,97,96};	// error
		// 선언과 동시에 초기화
		int a = scoreChemistry.length;
//		System.out.println(a);
		
//		System.out.println(scoreChemistry[0]);
//		System.out.println(scoreChemistry[6]);
//		
//		int a = scoreChemistry.length;
		
		int sum = 0;
		for(int i=0; i<scoreChemistry.length; i++) {
			System.out.println(scoreChemistry[i]);
			sum = sum + scoreChemistry[i];
		}
		System.out.println("sum: " + sum);
		System.out.println("----------");
//
//		int sum2 = 0;
//		int i = 0;
//		while(i<scoreChemistry.length) {
//			System.out.println(scoreChemistry[i]);
//			sum2 = sum2 + scoreChemistry[i];
//			i++;
//		}
//		System.out.println("sum2: " + sum2);
//		System.out.println("----------");
//		
//		int sum3 = 0;
//		for(int bb: scoreChemistry) {
//			System.out.println(bb);
//			sum3 = sum3 + bb;
//		}
//		System.out.println("sum3: " + sum3);
		
		
	}

}
