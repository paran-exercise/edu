package com.paran.chapter13;

public class ArrayDemo {
	
	public static void main(String[] args){
		
		int[] beforeArray = new int[10];
		for(int i=0; i < beforeArray.length ; i++){
			beforeArray[i]=i+1;
		}
		
		for(int i=0;i < beforeArray.length;i++){
			System.out.print(beforeArray[i]+" ");			
		}
		
		System.out.println("\n");
		
		reverseArrValue(beforeArray);
		
		sortArrValue(beforeArray, 1);
		
		System.out.println("\n");
		
		for(int i=0;i < beforeArray.length;i++){
			System.out.print(beforeArray[i]+" ");			
		}
		
		sortArrValue(beforeArray, 2);
		
		System.out.println("\n");
		
		for(int i=0;i < beforeArray.length;i++){
			System.out.print(beforeArray[i]+" ");			
		}
		
	}
	
	static void reverseArrValue(int[] Array){
		for(int i=Array.length-1;i>=0;i--){
			System.out.print(Array[i]+" ");
		}
	}
	
	static void sortArrValue(int[] Array, int ascendingDecending){
		int buffer=0;
		for(int i=0; i < Array.length-1; i++){
			for(int j=0; j < Array.length-1; j++){
				if(ascendingDecending == 1){
					if(Array[j] < Array[j+1]){
						buffer = Array[j];
						Array[j] = Array[j+1];
						Array[j+1] = buffer;
					}
				}else{
					if(Array[j] > Array[j+1]){
						buffer = Array[j+1];
						Array[j+1] = Array[j];
						Array[j] = buffer;
					}
				}
				
			}			
		}
	}
}
//int 배열 크기 10, 초기값 1~10할당
//return type : void
//parameter : int[] Array
//reverseArrayValue
