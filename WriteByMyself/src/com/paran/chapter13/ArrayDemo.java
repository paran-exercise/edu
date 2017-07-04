package com.paran.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayDemo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("c:/dev/asd.txt"));
		String line = br.readLine();
		System.out.println(line.substring(14, 27));
	}
}
