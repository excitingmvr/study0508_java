package com.mycompany.study.ch07.second;

public class ExStudent {

	public static void main(String[] args) {
		
		// 명시적 생성자를 사용하여 객체를 생성하고 
		// 모들 필드를 출력하시요
		
		Student student = new Student("Tony", "1234-1234", 19);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);
		student.sayName();
		
		
//		Student student2 = new Student("Crystal", "4321-4321");
//		
//		System.out.println(student2.name);
//		System.out.println(student2.ssn);
//		System.out.println(student2.studentNo);
//		student2.sayName();

	}

}
