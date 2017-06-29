package com.paran.chapter13;
import java.util.Arrays;
public class ArrayDemo {
	
	int member;
	int[][] dataMatrixArr; 
//	static final int FIRST_DIM_SIZE = 2;
//	static final int SECOND_DIM_SIZE = 2;
	public void initMatrixArr(int firstDimSize, int secondDimSize){
		dataMatrixArr = new int[firstDimSize][secondDimSize];
		
		int incrementValue = 0;
		for(int i = 0; i <dataMatrixArr.length; i++){
			for(int j = 0; j < dataMatrixArr[i].length; j++){
				dataMatrixArr[i][j] = ++incrementValue;
				
				
			}
		}
	}
	
	
	public void transformArrSize(){
		dataMatrixArr[3] = new int[]{0,0,0,0,0,0,0,0};
	}
	
	
	
	 
	
	
	/**
	 * @author 2강008
	 * @param array
	 * @return void
	 */
public static void reverseArrayValue(int[] array){
	int temp = 0, front = 0, rear =  array.length-1;
	for(;front < array.length /2; front++,rear-- ){
		temp = array[front];
		array[front] = array[rear];
		array[rear] = temp;
	}
}
public static void main(String[] args) {

	ArrayDemo obj = new ArrayDemo();
	
	obj.initMatrixArr(4, 4);
	System.out.println("31324");
	obj.transformArrSize();
	
	
		int[] reverseArr  = {1,2,3,4,5,6,7,8,9,10};
//		reverseArrayValue(reverseArr);
//		for(int val : reverseArr){
//			System.out.println(val);
//		}
		
		
		Arrays.sort(reverseArr);
		
		for(int i = 0 ; i < reverseArr.length; i++){
			System.out.println(reverseArr[i]);
		}
		
		
	}
}	
