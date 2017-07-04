package com.paran.chapter13;

public class ArrayMethod1 {

	// @@@  type MethodName,(parameter1,parameter2.... n)
	// @!   자료형에 int + [] =  자료형(primitive Type + Reference Type ) 자료형 종류가 다르면 사용가능?! 
	// @ -- float[]	로 만들어 보자. 
	// @ Access world function Declaration
	// @ insert return Method 	
	// 자료형 타입 메서드에 배열을 넣어 ( 파라미터1: 인트배열 , 파람2: 인트 변수)
//	 	for statement   통해 배열보다 +1 
	//  메서드 기능: 
		
		
		
		public static int[] addAllArray(int[] ar,int addVal)  // 메서드  자료형(int 배열)|메세드명 |인자|
		{
			for(int i=0; i<ar.length;i++)
				ar[i]+=addVal; // 더한 후 대입  addVal + 1 평가 된후   = ar[i] 할당 , ar변수 배열 i인덱스 적용   
		return ar;				// 
		}
		public static void main(String[] args) 
		{
			

			int[] arr={1,2,3,4,5}; // 1차원 배열에 5개 값을 할당
			int[] ref;			  // ref 참조값 전달 	
			ref=addAllArray(arr,7); // addAllArray ( arr이란 5개 배열과 값 전달 , addVal=7 할당) 
			if(arr==ref)
				System.out.println("동일배열 참조 ");
			else 
				System.out.println("다른 배열참조 ");
			for(int i = 0; i<ref.length;i++)
				System.out.println(arr[i]+"");
		} 

	}
