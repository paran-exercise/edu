package com.paran.chapter13;

public class ArrayDemo {
	  public static void main(String[] args) {
		  int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		  System.out.println("변경 전");
		  for(int i = 0; i < array.length; i++) {
			  System.out.print(array[i] + " ");
		  }
      
		  reverseArrayValue(array);
		  System.out.println("\n변경 후");
		  for(int i = 0; i < array.length; i++) {
			  System.out.print(array[i] + " ");
		  }
	  }
	  public static void reverseArrayValue(int[] arr) {
		  int swapPlace = 0;
		  for(int i = 0; i < arr.length; i++) {
			  for(int y = i+1; y < arr.length; y++) {
				  if(arr[i] < arr[y]) {
					  swapPlace = arr[y];
					  arr[y] = arr[i];
					  arr[i] = swapPlace;
				  }
			  }
		  }
	  }
}