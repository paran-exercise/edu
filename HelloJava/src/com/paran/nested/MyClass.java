package com.paran.nested;

public class MyClass {
	public static void main(String[] args){
		OuterDemo outer = new OuterDemo(100);
		OuterDemo.InnerDemo inner1 = outer.new InnerDemo();
		// outer에대한 인스턴스 생성후 inner 인스턴스 생성해야함!!!!
		// 
		OuterDemo.InnerDemo inner = outer.new InnerDemo();
		System.out.println(inner.getNum());
		
		OuterDemo outer1 = new OuterDemo(200);
		System.out.println(outer1.getInnerObj().getNum());
		
		
	}
}

class OuterDemo{
	
	private int num;
	private InnerDemo innerObj;
	
	public class InnerDemo{
		public int getNum(){
			System.out.println("This is the getnum method of the inner class"+num);
			return num;
		}
	}
	
	public OuterDemo(int num){
		this.num = num;
		innerObj = new InnerDemo();
	}
	public InnerDemo getInnerObj(){
		return innerObj;
	}
}