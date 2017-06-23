package com.paran.chapter2;

public class InstanceDemo {
	public static void main(String[] args){
	}
}

class Printer{
	String manufacture;
	boolean isColorPrinter; // true // false
	
	public Printer(String manufacture, boolean isColorPrinter){
		this.manufacture = manufacture;
		this.isColorPrinter = isColorPrinter;
	}
	// 1
	public void print(String msg){
		if ( isColorPrinter ){
			System.out.println(manufacture + " color print " + msg);
		}else{
			System.out.println(manufacture + " mono print " + msg);			
		}
	}
	// 2
	public int print(int p){
		if ( isColorPrinter ){
			System.out.println(" int color print " + p);
		}else{
			System.out.println(" int mono print " + p);			
		}
		return 0;
	}	
	/**
	 * @description 두개의 정수를 입력 받아 합을 리턴하는 함수
	 * @param op1
	 * @param op2
	 * @return 합
	 */
	public int add(int op1, int op2){
		return op1+op2;
	}
	
	/**
	 * @description 두개의 정수를 입력 받아 합을 리턴하는 함수
	 * @param float op1
	 * @param float op2
	 * @return 합
	 */
	public float add(float op1, float op2){
		return op1+op2;
	}	
	public static void printA(String msg, boolean isColor){
		System.out.println("msg" + msg);
	}
}

