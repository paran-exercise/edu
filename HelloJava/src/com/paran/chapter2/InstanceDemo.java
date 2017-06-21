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
		
		//epsonPrinter.printA(msg, true);
		
		Printer.printA(msg, false);
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
	public static void printA(String msg, boolean isColor){
		System.out.println(msg + isColor);
	}
}
