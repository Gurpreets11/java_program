package com.interviewques;

import java.util.HashMap;
import java.util.Map;

public class CountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseSt= "Android Java Kotlin Flutter Spring AWS Java Kotlin";
		System.out.println("  String ::" + reverseSt);
		
		//char[] ch = reverseSt.toCharArray();
		String ch[]= reverseSt.split(" ");
		HashMap<String , Integer> hmap = new HashMap<>();
		
		
		for(int i=0; i< ch.length; i++) {
			String key=String.valueOf(ch[i]);
			if(hmap.containsKey(key)) {
				int val = hmap.get(key) + 1;
				hmap.put(key, val);
				
				
			}else {
				hmap.put(key, 1);
			}
			
		}
		
		
		for(Map.Entry<String , Integer> val :  hmap.entrySet()) {
			System.out.println("  String ::" + val.getKey() + ", value ::" + val.getValue());
		}
	}

}
