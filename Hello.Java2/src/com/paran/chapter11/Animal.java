package com.paran.chapter11;

public class Animal {
	public static void testClassMethod(){ //클래스 함수
		System.out.println("The static method in Animal");
	}
	public void testInstanceMethod(){ //인스턴스 함수
		System.out.println("The instance method in Animal");
	}
}
class Cat extends Animal{
	public static void testClassMethod(){
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod(){
		System.out.println("The instance method in Cat");
	}
	public static void main(String[] args){
		//Cat 클래스의 인스턴스 생성, myCat 참조 변수로 해당 인스턴스 참조
		Cat myCat = new Cat();
		//Upcasting 발생
		Animal myAnimal = myCat;
		myAnimal.testInstanceMethod();
		
		myCat.testClassMethod();
		myAnimal.testClassMethod();

//		Animal.testClassMethod();
	}
}
//인스턴스 메서드 => 오버라이딩
//