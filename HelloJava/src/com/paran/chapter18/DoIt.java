package com.paran.chapter18;

public interface DoIt {
	void doSomething(int i, double x);
	int doSomethingElse(String s);
	default boolean didItWork(int i, double x, String s) {
		System.out.println("DoIt");
		return true;
	}
}

interface DoItPlus extends DoIt {
	default boolean didItWork(int i, double x, String s) {
		DoIt.super.didItWork(i, x, s);
		System.out.println("DoItPlus");
		return true;
	}
}

class DoSomething implements DoItPlus {
	
	public static void main(String[] args) {
		DoSomething ds = new DoSomething();
		
		ds.doSomething(1, 1);
		ds.doSomethingElse("true");
	}

	@Override
	public void doSomething(int i, double x) {
		// TODO Auto-generated method stub
		didItWork(1, 1.1, "a");
	}
	
	@Override
	public int doSomethingElse(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
}
