package com.paran.chapter2;

public class Variables {
	int variType;
	final static int MAX_NO = 5;		// 변하지 않는 상수를 대문자로 표기하는게 보편적.
	static int MAX_NO1 = 10;			// 클래스 변수, 상수와 클래스 변수의 차이점은 final이 붙냐 안붙냐임.
	
//	public static void main(String[] args) {
//		System.out.println(MAX_NO);
//		System.out.println(MAX_NO1);
//		
//		MAX_NO = 10;					// final 함수가 붙었기 때문에 재할당이 불가능함.
//		MAX_NO1 = 100;
//	}
	
	public final void showInfo() {
		System.out.println(variType);
	}
	
	class Animal {
		public void breathe() {
			System.out.println("동물 숨쉬기");
		}
	}
	
	public class Person extends Animal {
		public void main(String[] args) {
			Person obj = new Person();
			obj.breathe();
		}	
	}
	
}
