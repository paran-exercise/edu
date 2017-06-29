package com.paran.chapter11;

public class StringDemo {
	public static void main(String[] args){
		String str1 = "A";
		String str2 = "B";
		String str3 = "A";
		String str4 = new String("A");
		
		if( str1 == str2 ){
			System.out.println("1");//출력x
		}
		
		if( str1 == str3 ){
			System.out.println("2");//출력
		}
		
		if( str1 == str4 ){
			System.out.println("3");//출력x
		}
	}
}
