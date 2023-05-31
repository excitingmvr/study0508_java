package com.mycompany.study.ch04;

public class ExIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ch04.01
		
		// if - 학점 계산
		// A: 90 : 97 93
		//	B: 89~80
		//	C: 79 ~ 70
		//	D: 69 ~ 60
		//	F: 59 ~
		
		int score = 49;
		
		if(score >= 90) {
			if(score >= 97) {
				System.out.println("당신의 학점은 A+ 입니다. 참잘했어요!!");
			} else if (score < 97 && score >93) {
				System.out.println("당신의 학점은 A 입니다. 참잘했어요!!");
			} else { 
				System.out.println("당신의 학점은 A- 입니다. 참잘했어요!!");
			}
		} else if(score >= 80) {
			if(score >= 87) {
				System.out.println("당신의 학점은 B+ 입니다.");
			} else if (score < 87 && score >83) {
				System.out.println("당신의 학점은 B 입니다.");
			} else { 
				System.out.println("당신의 학점은 B- 입니다.");
			}
		} else if(score >= 70) {
			if(score >= 77) {
				System.out.println("당신의 학점은 C+ 입니다.");
			} else if (score < 77 && score >73) {
				System.out.println("당신의 학점은 C 입니다.");
			} else { 
				System.out.println("당신의 학점은 C- 입니다.");
			}
		} else if(score >= 60) {
			if(score >= 67) {
				System.out.println("당신의 학점은 D+ 입니다.");
			} else if (score < 67 && score >63) {
				System.out.println("당신의 학점은 D 입니다.");
			} else { 
				System.out.println("당신의 학점은 D- 입니다.");
			}
		} else {
			System.out.println("당신의 학점은 F 입니다. 성적이 인생에 있어서 중요한 것은 아닙니다. 화이팅");
		}
		
		
	}

}
