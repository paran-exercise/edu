package com.paran.chapter5;

public class BreakContinueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i < 3; i++){
			if(i == 2) return;
			System.out.println("outer  i" + i);
		}
	}

}
