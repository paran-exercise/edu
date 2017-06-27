package com.paran.chapter5;

public class BreakContinueDemo {
	public static void main(String[] args) {
		int count = 3;
		
//		for(int i = 0; i < count; i++) {
//			if( i == 0 || i%2 != 0) {
//				continue;
//			}
//				System.out.println("2배수 " + i);
//		}
		
		for(int i = 1; i < 3; i++) {
			for(int j = 1; j < 3; j++) {
				if( i == 2) break;
				System.out.println("inner j " + j);
			}
			System.out.println("outer i " + i);
		}
		
	}
}
