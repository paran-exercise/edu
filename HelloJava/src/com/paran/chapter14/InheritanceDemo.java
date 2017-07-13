package com.paran.chapter14;

public class InheritanceDemo {
	public static void main(String[] args){
		B instB = new B(2);
		C instC = new C(5);
		A instA ;
		
		
		
		instB.methodA();
		instB.salary = 1;
		instB.age = 27;
		
		instA = instC;
		instA.methodA();
		
		System.out.println(instC.age);
		instC.age = 10;
		System.out.println(instC.age);
	}
}

class A{
	public int age;

	public A (int age){
		this.age = age;
	}
	
	public void methodA(){
		System.out.println("methodA in A class");
	}
}
//1. 파라미터 age를 받아서 인스턴스 변수 age에 할당하는 B클래스 생성자 함수 생성
//2. 1에서 만든 생성자 함수는 superclass A의 생성자 함수를 호출 age파라미터를 전달, 해당 생성자 함수는 age 변수에 값 설정

class B extends A{
	public int salary;
	public int age;
	//파라미터 age B클래스 

	public B(int age){
		super(age);
		this.age = age;		
	}	
		
	public void methodA(){
		System.out.println("methodA in B class");
	}
	public void methodB(){
		System.out.println("methodB in B class");
	}
	public void methodC(){
		System.out.println(super.age);
	}
}
class C extends B{
	public int age;
	
	public C(int age) {
		super(age);
		this.age = age;
	}
}