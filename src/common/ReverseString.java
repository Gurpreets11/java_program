package com.interviewques;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String reverseSt= "JavaAndroid";
		System.out.println("Before Reverse String ::" + reverseSt);
		char[] ch= reverseSt.toCharArray();
		
		String newst="";
		for(int i=ch.length-1; i>-1; i--) {
			newst= newst+""+ ch[i];
		}
		
		System.out.println("Reverse String ::" + newst);

	}

}
