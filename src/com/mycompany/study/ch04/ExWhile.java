package com.mycompany.study.ch04;

public class ExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 10까지 더하는 프로그램 작성
		
		int sum = 0; 
		int i = 1; 
		
		while( i<=10 ) {
		    sum = sum+i;
		    i++;
		    System.out.println(sum);
		}
		
	    System.out.println("total sum: " + sum);
	}

}
