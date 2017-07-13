package com.paran.chapter11;

public class MethodOverridingDemo {

}
class Animal{
	
	public static void testClassMethod(){
		System.out.println("The static method in Animal");
	}
	public void testInstanceMethod(){
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
		
		Cat myCat = new Cat();
		Animal myAnimal = myCat; //묵시적 upcasting일어남
		
		//animal에 노출된 method만 호출		
		myCat.testClassMethod();
		myAnimal.testClassMethod();
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();//cat의 함수 호출 overriding 되었기 때문
	}
}
