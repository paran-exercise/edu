package com.paran.chapter13;

public class korn {
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for(int i:array){
			System.out.print(i);
		}
		PlayWithArray.reverseArrayValue(array);
		System.out.print('\n');
		for(int i:array){
			System.out.print(i);
		}
	}
}
class PlayWithArray{
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
	static void bubbleArrayValue(int[] array){
		for(int i=0;;){
			
		}
	}
}

	
	