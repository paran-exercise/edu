package com.paran.chapter13;

public class ArrayDemo {
	int[][] dataMatrixArr;
	static final int FIRST_DIM_SIZE = 2;
	static final int SECOND_DIM_SIZE = 2;	
	public void intMatrixArr(int firstDimsize, int secondDimsize) {
		dataMatrixArr = new int[firstDimsize][secondDimsize];
		int increamentValue = 0;
		for(int i = 0; i < dataMatrixArr.length; i++) {
			for(int j = 0; j < dataMatrixArr[i].length; j++) {
				dataMatrixArr[i][j] = ++increamentValue;
			}
		}
	}
	
	public void transformMatrixArr() {
		dataMatrixArr[3] = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
	}
	
	public static void main(String[] args) {
		ArrayDemo obj = new ArrayDemo();
		obj.intMatrixArr(4, 4);
		obj.transformMatrixArr();
		System.out.println("31324");
	}
//		int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		System.out.println("변경 전");
//		for(int arr : Array) {
//			System.out.print(arr + " ");
//		}
//		
//		reverseArrayValue(Array);
//		System.out.println("\n뒤집기 변경 후");
//		for(int arr : Array) {
//			System.out.print(arr + " ");
//		}
	
	/**
	 * @return type : void
	 * @param param
	 */
	public static void reverseArrayValue(int[] param) {
		int temp = 0, front = 0, rear = param.length -1;
		for(; front < param.length/2; front++,rear--) {
			temp = param[front];
			param[front] = param[rear];
			param[rear] = temp;
		}
	}

//	public static void reverseArrayValue(int[] Arr) {
//		int swapPlace = 0;
//		for(int i = 0; i < Arr.length/2; i++) {
//			swapPlace = Arr[i];
//			Arr[i] = Arr[Arr.length-i-1];
//			Arr[Arr.length-i-1] = swapPlace;
//		}
//	}
	
	
}