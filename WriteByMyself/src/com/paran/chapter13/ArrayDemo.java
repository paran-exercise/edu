package com.paran.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ArrayDemo {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new FileReader("c:/dev/asdq.txt"));
//		String line = br.readLine();
//		String[] splitLine;
//		splitLine = line.split("_");
//		System.out.println(splitLine[3].equals("Fore"));
//	
		BufferedReader br = new BufferedReader(new FileReader("c:/dev/asdq.txt"));
		int lineCount=0;
		String line;
		String[] splitLine = new String[10]; 		
		
		while((line = br.readLine()) != null){
			splitLine = line.split("_");
			
			if(splitLine[3].equals("Fore")){
				System.out.println(splitLine[3]);
			}
		}
	}
}
