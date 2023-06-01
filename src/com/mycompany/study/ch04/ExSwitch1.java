package com.mycompany.study.ch04;

public class ExSwitch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2;
		
		switch (num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1번도 2번도 아닌 것이 나왔습니다.");
				break;
		}
		
		// 사장, 부장, 과장, 대리, 주임, 사원, 나
		// 사장의 연봉은 얼마 입니다. 
		// 100, 100, 
		
		String position = "부장";
		
		switch (position) {
		case "사원": // if(position.equals("부장"))
			System.out.println("연봉은 5,000 입니다.");
			break;
		case "대리":
			System.out.println("연봉은 6,000 입니다.");
			break;
		case "과장":
			System.out.println("연봉은 8,000 입니다.");
			break;
		case "부장":
			System.out.println("연봉은 11,000 입니다.");
			break;
		case "사장":
			System.out.println("연봉은 20,000 입니다.");
			break;
		default:
			System.out.println("없는 position 입니다. 다시 입력해 주세요");
			break;
		}
		
		
	}

}
