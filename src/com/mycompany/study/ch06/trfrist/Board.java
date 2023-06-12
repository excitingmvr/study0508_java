package com.mycompany.study.ch06.trfrist;

import java.util.Date;

public class Board {
	
	String title;
	int count;
	int view;
	boolean isNew;
	Date regDate;
	String contents;
	
	Board(String title){
		this.title = title;
	}
	
	void insert() {
		System.out.println("게시글을 등록 합니다.");
	}
	
	void selectList() {
		System.out.println("게시글 목록을 조회 합니다.");
	}
	
	void selectOne() {
		System.out.println("게시글을 조회 합니다.");
	}

	void update() {
		System.out.println("게시글을 수정 합니다.");
	}
	
	void delete() {
		System.out.println("게시글을 삭제 합니다.");
	}
	
}
