package com.paran.chapter1;

public class HelloJava{
	// 생성자 함수는 인스턴스를 생성하면서 실행되는 함수

	String helloStr = "Hello! World.";		// 인스턴스 멤버 변수
	static int MAX_NUMBER = 10;		// 클래스 멤버 변수

	public HelloJava(){		// 생성자, 생성자함수
	}
	// 
	// 
	public static void printMsg(String msg){ // 클래스 멤버 함수( 12-14 Line )
		System.out.println(msg);
	}
	
	// 자바 클래스를 실행하면 시작되는 진입점(entry point)
	// 클래스로 인스턴스를 생성하지 않으면 메서드, 요소를 사용 불가
	public static void main(String[] args){	// 클래스 멤버 함수( 18-23 Line )
		printMsg(helloStr);
		printMsg(MAX_NUMBER+" ");
		/*
		printMsg("Hello!");
		HelloJava obj = new HelloJava();
		obj.printMsg("Hello!"); */
	}
}