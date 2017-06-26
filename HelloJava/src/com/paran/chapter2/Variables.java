package com.paran.chapter2;


public class Variables {
	int vartype;
	final static int MAX_NO = 5; //변하지 않는 상수는 대문자로 쓰는게 보편적
	static int MAX_NO1 = 10; // 클래스 변수

//     public static void main(String[] args){
//        System.out.println(MAX_NO);
//        System.out.println(MAX_NO1);
//        
//        MAX_NO = 11;
//        MAX_NO1 = 12;
//     }
     
	public final void showInfo(){
    	 System.out.println(vartype);
	}
}

class Animal {
	public void breath(){
	   System.out.println("동물 숨쉬기");
	}
}
class Persons extends Animal {
	public void breath() {
		System.out.println("사람 숨쉬기");
	}
	public static void main(String[] args) {
	   Persons obj = new Persons();
	   obj.breath();
	}
}