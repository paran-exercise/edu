package com.paran.chapter3;

public class CastingDemo {
	public static void main(String[] args) {
		
		CastingDemo obj = new CastingDemo();	// 2번째, main 클래스에 인스턴스 생성 
		
		obj.num1 = 10000000000;
		obj.num2 = 10000000000;
		obj.num3 = 12.45;				// 3번째, 1번에서 선언된 변수에 값을 Assign(할당)
	}
	
	int num1;
	long num2;
	float num3;  // 1번째, 인스턴스 변수 선언
}