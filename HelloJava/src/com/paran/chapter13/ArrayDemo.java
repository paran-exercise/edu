package com.paran.chapter13;

public class ArrayDemo11 {

/*
 * 
 * @ reverseArrayVale 메서드 사용 
 * @   parameter (int [] array)
 *  배열을 숫자교환을 하기 위한 변수선언과 초기화  
 *  - temp,head,end 
 *  @ for문에 반복횟수, 치환대상 한계설정 
 *  
 * 
 */
	public static void reverseArrayValue(int[] array) {
 		int temp = 0, head = 0, end = array.length -1;
 		for(; head < array.length/2; head++,end--) {
 			temp = array[head]; 
 			array[end] = temp;

 		}
 		
	}	
	public static void main(String[] args) {

// Crate Array  		
		int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	 	System.out.println("Before Array value ");
			for(int array1 : Array) {
				System.out.print(array1 + " ");
			}
// @ Call Method -  reverseArrayValue
			
	 		reverseArrayValue(Array);
	 		System.out.println("\nAfter Array value");
	 		for(int array1 : Array) {
	 			System.out.print(array1 + " ");
			}
		
	}

}
