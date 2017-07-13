package com.paran.chapter19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ExceptionDemo {
	static void methodA(){
		try{
			methodB();
		}catch(Exception e){
			
		}
		
	}
	static void methodB() {
		System.out.println("before calling methodC");
		methodC();
		System.out.println("after calling methodC");
	}
	static void methodC(){
		System.out.println("before exception occured");
		int i = 0;
		i = i/0; //Arithmetic Exception 발생
		System.out.println("After exception occured in methodC");
	}
	public static void main(String[] args){
		methodA();
		System.out.println("main 정상종료");
	}
}
class ThrowDemo{
	public final static int SIZE = 100;
	public static void method() throws IOException{
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		for(int i = 0;i < SIZE; i++){
			
		}
		out.close();
	}
}
