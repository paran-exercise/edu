package com.paran.chapter2;

public class InstanceDemo {
	public static void main(String[] args){
		//인스턴스 : new+생성자
		String msg = "hello printer!";
		Printer ssPrinter = new Printer("삼성", true);
		Printer hpPrinter = new Printer("HP", false);
		Printer epsonPrinter = new Printer("Epson", false);
		
		ssPrinter.print(msg);
		hpPrinter.print(msg);
		epsonPrinter.print(7);
		
		int ii = '1';
		int i = 1;
		
		System.out.println("==========");
//		System.out.println(epsonPrinter.add(1,2));
		System.out.println(epsonPrinter.add(1.1f, 2.1f));
		System.out.println(ii);
		System.out.println(i);

//		float f = 1.1f;
//		char c = 'c';
		
//		System.out.println(ii);
		
//		String str = "abc";
		
//		System.out.println(true);
		
		
		
		epsonPrinter.printA(msg, false);
		
		Printer.printA(msg, false); //static 함수는 인스턴스를 생성하지 않고 실행
	}
}

class Printer{
	String manufacture;//멤버변수
	boolean isColorPrinter; //true //false
	
	public Printer(String manufacture, boolean isColorPrinter){
		this. manufacture = manufacture; //대입 연산자 = 오른쪽에서 왼쪽
		this. isColorPrinter = isColorPrinter;
	}
	//1
	public void print(String msg){
		if(isColorPrinter){
			System.out.println(manufacture + " color print " + msg);
		}else{
			System.out.println(manufacture + " mono print " + msg);
		}
	}
	//2
	public int print(int p){
		if(isColorPrinter){
			System.out.println("int color print " + p);
		}else{
			System.out.println("int mono print " + p);
		}
		return 0;
	}
	
	public float add(float op1, float op2){
		return op1+op2;
	}
	public static void printA(String msg, boolean isColor){
		System.out.println(" msg " + msg);
		
	}
}
// 명명규칙 =  naming rule, naming conversion