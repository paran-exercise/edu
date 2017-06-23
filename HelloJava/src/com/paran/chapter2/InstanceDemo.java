package com.paran.chapter2;

public class InstanceDemo {
	public static void main(String[] args){
		
		String msg= "Hello Printer!";
		
		Printer ssPrinter = new Printer("삼성", true);
		Printer hpPrinter = new Printer("HP", false);
		Printer epsonPrinter = new Printer("Epson", false);
		
		ssPrinter.print(msg);
		hpPrinter.print(msg);
		epsonPrinter.print(msg);
		epsonPrinter.print(1);
		
//		System.out.println();
//		System.out.println(false);
//		System.out.println('c');
//		System.out.println();
//		System.out.println(ssPrinter);

		System.out.println(epsonPrinter.add(1, 2));
		System.out.println(epsonPrinter.add(1.1f, 2.1f));
		
//		int i = '1';
//		float f =1.1f;
//		char c = 'c';
//		System.out.println(i);
//		epsonPrinter.printA(msg, true);		
//		Printer.printA(msg, false);
		
	}
}
class Printer{
	String manufacture;
	boolean isColorPrinter;// true // false
	
	public Printer(String manufacture, boolean isColorPrinter){
		this.manufacture = manufacture; // = 할당연산자 오른쪽 내용이 왼쪽으로
		this.isColorPrinter = isColorPrinter;
	}
	
	public void print(String msg){
		if(isColorPrinter){
			System.out.println(manufacture + " color print" + msg);
		}else{
			System.out.println(manufacture + " mono print" + msg);
		}
	}
	/**
	 * 
	 * @param op1
	 * @param op2
	 * @return op1+op2
	 */
	public int add(int op1, int op2){
		return op1+op2;
	}
	public float add(float op1, float op2){
		return op1+op2;
	}
	public void print(int p){
		if(isColorPrinter){
			System.out.println("int color print" + p);
		}else{
			System.out.println("int mono print" + p);
		}
	}
	
	public static void printA(String msg, boolean isColor){
		System.out.println(msg + isColor);
	}
}
