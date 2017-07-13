package com.paran.nested;

public class Outer {
	public String name;
	
	public Outer(String name){
		this.name = name;
	}
	static class NestedDemo{
		public int age;
		public NestedDemo(int age){
			this.age=age;
		}
		public void myMethod(){
			System.out.println("This is my nested class " + age);
		}
	}
	public void showInfo(){
		System.out.println(name);
	}
	public static void main(String[] args){
		Outer obj1 = new Outer("age");
		obj1.showInfo();
		Outer.NestedDemo obj2 = new Outer.NestedDemo(20);
		
//		obj1.myMethod();
		obj2.myMethod();
		
		
	}
}
