package com.paran.chapter2;

public class InstanceDemo {
	public static void main(String[] args){		
		
		String msg = "hello printer!";
		Printer ssPrinter = new Printer("삼성" , true);
		Printer hpPrinter = new Printer("HP" , false);
		Printer epsonPrinter = new Printer("Epson" , false);
		
		ssPrinter.print(msg);
		hpPrinter.print(msg);
		epsonPrinter.print(msg);
		
	}
}

class Printer{
	
	String manufacture;
	boolean isColorPrinter;
	
	public Printer(String manufacture, boolean isColorPrinter){
		
		this.manufacture = manufacture;
		this.isColorPrinter = isColorPrinter;
		
	}
	
	public void print(String msg){
		
		if(isColorPrinter){
			
			System.out.println(manufacture + " color print " + msg);
			
		}else{
			
			System.out.println(manufacture + " mono print " + msg);
			
		}
			
	}	
}
