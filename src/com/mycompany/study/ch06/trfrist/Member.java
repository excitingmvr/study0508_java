package com.mycompany.study.ch06.trfrist;

public class Member {
	
	String name;
	String id;
	String pwd;
	String email;
	
	void signIn() {
		System.out.println("로그인을 합니다.");
	}
	
	void use() {
		System.out.println("회원정보를 가져옵니다.");
	}
	
	void signUp() {
		System.out.println("회원가입을 합니다.");
	}
	
	void delete() {
		System.out.println("회원탈퇴를 합니다.");
	}
	
	void update() {
		System.out.println("회원정보를 수정합니다.");
	}
	
	
	Member(String x,String y,String z, String zy){
		this.name = x;
		this.name = y;
		this.name = z;
		this.name = zy;
	}
	
	void lookUpEmail(int x) {
		System.out.println( x + "번째의 멤버의 E-mail을 확인하겠습니다");
	}
	void lookUpId(int y) {
		System.out.println( y + "번째의 멤버의 ID를 확인하겠습니다");
	}
}
