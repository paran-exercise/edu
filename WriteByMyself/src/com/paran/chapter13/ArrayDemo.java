package com.paran.chapter13;

public class ArrayDemo {
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		ArrayDemo.reverseArrayValue(array);
		for(int i:array){
			System.out.print(i+" ");
		}
	}
	static void reverseArrayValue(int[] array){
		int i=0, s, j=array.length-1;
		
		while(i<array.length/2){
			s = array[i];
			array[i] = array[j];
			array[j] = s;
			i++;
			j--;
		}
	}
}

