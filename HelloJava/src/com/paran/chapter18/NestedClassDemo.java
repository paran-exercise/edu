package com.paran.chapter18;

public class NestedClassDemo {
	private int age;
	private class InnerClass {
		public void showAge() {
			System.out.println("age = > " + age);
		}
	}
}
