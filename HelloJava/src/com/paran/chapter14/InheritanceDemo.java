package com.paran.chapter14;

public class InheritanceDemo {
	public static void main(String[] args) {
		B InstB = new B(1);
		C InstC = new C(2);
		A InstA = InstC;
		
		//자동으로 형변환, acasting
		InstA = InstB;
		
		Object obj = InstA;
		obj = InstB;
		obj = InstC;
		
		
		InstA.methodA();
		
		System.out.println(InstA.age);
		System.out.println(((B)InstA).age);
		
	}
}

class A {
	public int age;
	public A(int age) {
		this.age = age;
	}
	
	public void methodA() {
		System.out.println("methodA in A class");
	}
}
class B extends A {
	public int age;
	public B(int age) {
		//선행
		super(age);
		this.age = age;
	}

	public int salary;
	//Overide
	public void methodA() {
		super.methodA();
		System.out.println("methodA in B class");
	}
	public void methodB() {
		System.out.println("methodB in B class");
	}
	public void methodC() {
		System.out.println(super.age);
	}
}

class C extends B {
	public int age;
	public C(int age) {
		super(age);
		this.age = age;
	}
}