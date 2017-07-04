package com.paran.chapter5;

public class BreakContinue {
	
	public static void main(String[] args) {
		
		for(int i = 1; i<3; i++){
			for(int j=1; j<3; j++){
				if(i == 2) break;
			System.out.println("inner j"+j);
			}
			System.out.println("outter i"+i);
		}	
	}
}