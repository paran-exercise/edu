package com.paran.chapter13;

public class ArrayDemo {
	
	public static void main(String[] args){
		
		int[] valArray = new int[10];
		for(int i=0; i < valArray.length ; i++){
			valArray[i]=i+1;
		}
		
//		for(int i=0;i < valArray.length;i++){
//			System.out.print(valArray[i]+" ");			
//		}
		
		//System.out.println("\n");
		
		reverseArrValue(valArray);
		for(int i=0;i < valArray.length;i++){
			System.out.print(valArray[i]+" ");			
		}
		
		sortArrValue(valArray, 2);
						
		for(int i=0;i < valArray.length;i++){
			System.out.print(valArray[i]+" ");			
		}
		
		sortArrValue(valArray, 1);
				
		for(int i=0; i < valArray.length;i++){
			System.out.print(valArray[i]+" ");			
		}
		
	}
	
	public static void reverseArrValue(int[] array){
		int buffer = 0;
		for(int i = 0 , j = array.length-1;i<array.length/2;i++,j--){
			buffer=array[i];
			array[i]=array[j];
			array[j] = buffer;
		}
		
	}
	
	public static void sortArrValue(int[] array, int ascendingDecending){
		int buffer=0;
		for(int i=0; i < array.length-1; i++){
			for(int j=0; j < array.length-1; j++){
				if(ascendingDecending == 1){
					if(array[j] < array[j+1]){
						buffer = array[j];
						array[j] = array[j+1];
						array[j+1] = buffer;
					}
				}else{
					if(array[j] > array[j+1]){
						buffer = array[j+1];
						array[j+1] = array[j];
						array[j] = buffer;
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
