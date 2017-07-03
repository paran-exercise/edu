package com.paran.chapter11;

public class StringDemo {
	
	public static void main(String[] args){
		
		String str1 = "A"; //String constant pool에 올라감
		String str2 = "B"; //String constant pool에 올라감
		String str3 = "A"; //String constant pool에 올라감
		String str4 = new String("A"); //heap에 올라감
		
		if (str1 == str2){
			System.out.println("1");
		}
		if (str1 == str3){
			System.out.println("2");
		}
		if (str1 == str4){
			System.out.println("3");
		}
		
	}

}
