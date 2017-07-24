package com.paran.chapter18;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class ThrownDemo {
	public final static int SIZE = 100;
	public static void method() throws IOException {
		PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
		for (int i = 0; i < SIZE; i++) {
			// do something
		}
		out.close();
	}
	public static void main(String[] args) throws IOException {
		method();
	}
}
