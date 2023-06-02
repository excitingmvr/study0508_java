package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// kor, eng, math 과목별 총합과 평균
		// 사람별 총합과 평균
		String[] name = {"장동건","차태식","마동석","마장동","마해영"};
		
		int[][] score = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
		int sumKor = 0;
		int sumEng = 0;
		int sumMath = 0;
		
		int[] sumEach = {0,0,0,0,0};
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
//				System.out.println("score[" +i+"]["+j+"]: " + score[i][j]);
				
				switch(j) {
					case 0:
						sumKor = sumKor + score[i][j];
						break;
					case 1:
						sumEng = sumEng + score[i][j];
						break;
					case 2:
						sumMath = sumMath + score[i][j];
						break;
				}
				
				sumEach[i] = sumEach[i] + score[i][j];
			}
			System.out.println("----------");
			System.out.println(sumKor + " | " + sumEng + " | " + sumMath + " | ");
			System.out.println("----------");
			System.out.println(sumEach[1]);
		}
	}

}
