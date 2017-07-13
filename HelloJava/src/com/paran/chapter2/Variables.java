package com.paran.chapter2;

public class Variables {
	int varType;
	final static int MAX_NO = 5;//상수일때 _ 사용 / 상수는 static사용 /상수는 final 한정자사용 /final없으면 클래스 변수
	static int MAX_NOCLASS = 10;//클래스변수
	
//	public static void main(String[] args){
//		System.out.println(MAX_NO);
//		System.out.println(MAX_NOCLASS);
////		MAX_NO=1;//상수이기때문에 재할당 불가
//		MAX_NOCLASS=12;//클래스변수이기에 재할당 가능
//	}
	
	public final void showInfo(){
		System.out.println(varType);
	}
}
class Animal{
	public void breath(){
		System.out.println("동물 숨쉬기");
	}
}
class Person extends Animal{
	public void breath(){
		
		System.out.println("사람 숨쉬기");//다형성
	}
	public static void main(String[] args){
		Person obj = new Person();
		obj.breath();
	}
}
