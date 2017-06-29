package com.paran.chpter1;

public class HelloJava {
	//생성자 함수는 인스턴스를 생성하면서 실행되는 함수
	public HelloJava(){
		
	}
	int sum;
	public static void printMsg(String msg){
		System.out.println(msg);
	}
	int A;
	int B;
	
	// 자바 클래스를 실행하면 시작되는 진입점(entry point)
	// 클래스로 인스턴스를 생성하지 않으면 메소드, 요소를 사용 불가
	//
	
	public static void main(String[] args) {
		//
		
		printMsg("Hello");
		HelloJava obj = new HelloJava();
		obj.printMsg("Hello~!!"); 
		
		}
}

