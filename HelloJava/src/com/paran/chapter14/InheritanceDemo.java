package com.paran.chapter14;

public class InheritanceDemo {
	public static void main(String[] args) {
		B instB = new B(1);
		C instC = new C(1);  
		
		A instA;
		instA = instB;
		
		object obj = instB; //오브젝트 최상위의 클래스 
		
		System.out.println(instA.age);
		System.out.println(instB.age);
	}
}

// 상위 클래스에 age에도 받은 파라미터에 할당을 해주세요.

class A {
	public A(int age){
		this.age = age; 
	}
	public int age = 1;
	public void methodA() {
		System.out.println("method a in a Class");
	}
}

class B extends A {

	public int age =2;
	public int salary;
	public B(int age){
		super(age);
		this.age = age; 
	}
	// @override
	public void methodA() {
		System.out.println("method A in B Class" + a);
	}

	class C extends B {

		public int age;
		public C(int age){
			super(age);
			this.age = age; 
		}
		// @override
	
	
	public void methodbB() {
		System.out.println("method B in B Class");

	}

}