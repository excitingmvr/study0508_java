package com.mycompany.study.ch15.second;

import java.util.HashSet;
import java.util.Set;

public class ExHashSet {
	public static void main(String[] args) {
	
//		Set<String> set = new HashSet<>();
		
		HashSet<String> languages = new HashSet<>();
		
		languages.add("Java");
		languages.add("JDBC");
		languages.add("Servlet/JSP");
		languages.add("1");
		languages.add("2");
		languages.add("3");
		languages.add("4");
		languages.add("5");
		languages.add("6");
		languages.add("7");
		languages.add("8");
		languages.add("9");
		languages.add("Java");
		
		languages.remove("4");
		
		for(String language: languages) {
			System.out.println("language: " + language);
		}
		
		
	}
}
