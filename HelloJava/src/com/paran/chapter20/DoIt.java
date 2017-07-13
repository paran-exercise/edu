package com.paran.chapter20;

public interface DoIt{
	
	void doSomething(int i , double x);
	
	int doSomethingElse(String s);
	
	default boolean didItwork(int i, double x, String s){
		System.out.println("DoIt");
		return true;
	}
	
}

interface DoItPlus extends DoIt{
	
	default boolean didItWork(int i, double x, String s){//Doit의 didItWork 오버라이드함
		DoIt.super.didItwork(i, x, s);
		System.out.println("DoItPlus");
		return true;
	}
	
}

class DoSomething implements DoItPlus{

	@Override
	public void doSomething(int i, double x) {
		// TODO Auto-generated method stub
		didItWork(i,x,"a");
	}

	@Override
	public int doSomethingElse(String s) {
		// TODO Auto-generated method stub
		return 0;
	}
}
class InterfaceExample{
	
	public static void main(String[] args){
		
		DoSomething obj = new DoSomething();
		DoIt diInst = obj;
		DoItPlus ditInst =(DoItPlus)diInst;
		obj.doSomething(1, 1.1);
		obj.doSomethingElse("sasdf");
		
	}
	
}