package com.paran.chapter11;

public class Animal {
	public static void testClassMethod(){
		System.out.println("this static method in animal");
	}
	public void testInstanceMethod(){
		System.out.println("this instance method in animal");
	}
}


class cat extends Animal{
	public static void testClassMethod(){
		System.out.println("this static method in cat");
	}
	
	public void testInstanceMethod(){
		System.out.println("this instance method in cat");
	}
	
	
	public static void main(String[] args){
		//Cat 클래스의 인스턴스 생성, mycat 참조 변수로 해당 인스턴스 참조
		cat mycat = new cat();
		//UpCasting
		Animal myanimal = mycat;
		
		myanimal.testInstanceMethod();
		
		
		//아래 2개 문장처럼 사용하면 안되지만 이해를 돕기 위해
		mycat.testClassMethod();
		myanimal.testClassMethod();
//		Animal.testClassMethod();
		
	
	}
	
}
