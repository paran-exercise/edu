package com.paran.chapter2;

public class InstanceDemo {
	public static void main(String[] args) {
		String msg = "Hello Printer";
		Printer ssPrinter = new Printer("Samsung", true);
		Printer hpPrinter = new Printer("HP", false);
		Printer epsonPrinter = new Printer("Epson", false);
		
//		ssPrinter.print(msg);
//		hpPrinter.print(msg);
//		epsonPrinter.print(msg);
//		epsonPrinter.print(7);
//		
//		epsonPrinter.printa(msg, true);
//		
//		Printer.printa(msg, false); // 스태틱함수는 인스턴스를 실행하지 않고 실행.
		
		System.out.println(epsonPrinter.add(1,2));
		System.out.println(epsonPrinter.add(1.1f, 2.2f));
	}
}

class Printer {
	String Manufacture;				//인스턴스 멤버 변수
	boolean iscolorPrinter;			// true, false
	
	public Printer(String Manufacture, boolean iscolorPrinter) {			// 생성자함수, -> Manu-, isco- 파라미터
		this.Manufacture = Manufacture;
		this.iscolorPrinter = iscolorPrinter;
	}
	
	public void print(String msg) {			// 인스턴스 멤버 함수
		if( iscolorPrinter ) {
			System.out.println(Manufacture + " color print " + msg);
		} else {
			System.out.println(Manufacture + " mono print " + msg);
		}
	}
	
	public int print(int p) {			// 인스턴스 멤버 함수
		if( iscolorPrinter ) {
			System.out.println("int color print " + p);
		} else {
			System.out.println("int mono print " + p);
		}
		return p;
	}
	
	public int add(int op1, int op2) {
		return op1+op2;
	}
	
	public float add(float op1, float op2) {
		return op1+op2;
	}
	
	public static void printa(String msg, boolean iscolor) {
		System.out.println("MSG " + msg);
	}
}