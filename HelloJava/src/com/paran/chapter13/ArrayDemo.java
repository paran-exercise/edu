package com.paran.chapter13;

public class ArrayDemo {
	public static void main(){
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		reverseArrayValue(array);
		for(int i:array){
			System.out.println(i);
		}
	}
	static void reverseArrayValue(int[] array){
		int i=0, s, end=array.length-1;
		
		while(i<array.length/2){
			s = array[i];
			array[i] = array[end];
			array[end] = s;
			i++;
			end--;
		}
	}
}
// call by value, call by reference
