package com.paran.chapter19;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ThrownDemo{
	public final static int SIZE = 100;
	public static void method() throws IOException{// throws Exception 회피
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		for(int i = 0;i < SIZE; i++){
			
		}
		out.close();
	}
	public static void main(String[] args){
		try {
			method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}