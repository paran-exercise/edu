package com.paran.chapter5;

public class Condop {

	
	public static void main(String[] args) {

		
		
		int num1 = 48;
		int num2 = 200;
		int Max_value, diff_vale;	
		
	// ? :    조건 연산자  (결합규칙   Left to Right)
	// 조건연산자를 통해서 
		
	Max_value = (num1>num2) ? num1 : num2;
	System.out.println(Max_value);
	
		
	diff_vale = (num1>num2)? num1-num2 : num2-num1;
	System.out.println(diff_vale);
	
	}

}
