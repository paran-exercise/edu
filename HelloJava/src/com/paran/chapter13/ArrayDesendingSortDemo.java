package com.paran.chapter13;

public class ArrayDesendingSortDemo {
	
	public static void main(String[] args) {
		int[] Array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println("변경 전");
		for(int arr : Array) {
			System.out.print(arr + " ");
		}
		
		reverseArrayValue(Array);
		System.out.println("\n내림차순 정렬 변경 후");
		for(int arr : Array) {
			System.out.print(arr + " ");
		}
	}
	/**
	 * @param int[] Arr
	 * @author 2강014
	 * @return void
	 * @정렬종류 내림차순
	 */
	public static void reverseArrayValue(int[] Arr) {
		int swapPlace = 0;
		for(int i = 0; i < Arr.length; i++) {
			for(int y = i+1; y < Arr.length; y++) {
				if(Arr[i] < Arr[y]) {
					swapPlace = Arr[y];
					Arr[y] = Arr[i];
					Arr[i] = swapPlace;
				}
			}
		}
	}
} 