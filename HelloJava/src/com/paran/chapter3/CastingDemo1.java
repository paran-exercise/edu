package com.paran.chapter3;



//인스턴스 변수 선언 테스트 
// 지역 변수로 선언해서 테스트 하는 방법 
// 1. 변수 선언  (인스턴스 변수) >  클래스의  인스턴스 생성  >  변수를 생성 할당  


public class CastingDemo1 {

	// 클래스 변수 선언 //	
		
	int num1; 
	float num2;; 
	long num3;
	
	
	public static void main(String []args) {
	
		
	// 객체 생성// 	
			
		CastingDemo obj = new CastingDemo1();
			
	// 객체사용할 변수 대입// 	
		
		obj.num1 = 2;
		obj.num2 = 12.1f;
		obj.num3 = 12315400;	
 
			
		System.out.println("모두 합산한 결과는"+obj.num1+obj.num2+obj.num3); 	
	}
}

