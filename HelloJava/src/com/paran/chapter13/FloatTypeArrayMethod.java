package com.paran.chapter13;


public class FloatTypeArrayMethod {

// 사용메서드 : floatArray 
// 메서드 인자: 1 - float[] arr, 2: int value	
// 배열값에 1.1f 증가하도록 한다.  
	
	public static float[] shortArray(float[] arr,float value){
		for(int i = 0;i<arr.length;i++)
			arr[i]+=value;   // {(arr[i]+ 100.4f)+=value; 이렇게 했더니 변수만 할당할 수 있단다.-_-;  
			return arr;				// 그러므로 arr 변수 배열값에 원하는 값을 초기화 >  value 값에 증가값 넣어 해결 
		}
		
	public static void main(String[] args) {
		float[] arr={1.1f,22.2f,333.3f,4444.4f,55555.5f}; // 1차원 배열에 5개 값을 할당
		float[] ref;			  // ref 참조값 전달 	
		ref=shortArray(arr,100.4f); // addAllArray ( arr이란 5개 배열과 값 전달 , vaule=7 할당) 
		if(arr==ref)
			System.out.println("동일배열 참조 ");
		else 
			System.out.println("다른 배열참조 ");
		for(int i = 0; i<ref.length;i++)
			System.out.println(arr[i]+"");
	} 

		
	}


