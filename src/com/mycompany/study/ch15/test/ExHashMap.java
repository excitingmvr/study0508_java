package com.mycompany.study.ch15.test;

import java.util.HashMap;
import java.util.Map;

public class ExHashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

		map.put("홍길동", 90);
		map.put("신용권", 85);
		map.put("동장군", 80);
		
		hashMap.put("홍길동", 90);
		hashMap.put("신용권", 85);
		hashMap.put("동장군", 80);
		
		for( String strKey : map.keySet() ){
			Integer strValue = map.get(strKey);
			System.out.println( strKey +":"+ strValue );
		}
		
		map.forEach((key, value)->{
			System.out.println( key +":"+ value );
		});
		
		int result = map.get("동장군");
		System.out.println(result);
		
	}

}
