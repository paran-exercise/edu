package com.paran.chapter13;

public class ArrayDemo {
	int[][] dataMatrix ;
	
	public void initMatrixArr(int col, int row){
		dataMatrix = new int[col][row];
		int incrementValue = 0;
		for(int i = 0; i < dataMatrix.length; i++){
			for(int j = 0; j < dataMatrix[i].length; j++){
				dataMatrix[i][j] = ++incrementValue; 
			}			
		}
	}
	
	public void transformArrSize(){
		dataMatrix[3] = new int[]{0,0,0,0,0,0,0,0};
	}
	
	public static void main(String[] args){
		ArrayDemo obj = new ArrayDemo();
		obj.initMatrixArr(4, 4);
		obj.transformArrSize();
		int[] valArray = new int[5];
		
		for(int i = 0 ; i < valArray.length; i++){
			valArray[i]=(int)(Math.random()*10) + 1;
		}
		
		bubbleSort(valArray,2);
		for(int i = 0 ; i < valArray.length; i++){
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
	
	public static void bubbleSort(int[] array, int ascendingDecending){
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
	
	public static void seletionSort(int[] array){
		int minIdx, buffer;
		
		for(int i = 0; i < array.length-1 ; i++){
			minIdx = i;
			for(int j = i + 1; j <array.length;j++){
				if(array[j]<array[minIdx]){
					minIdx = j;
				}
			}
			buffer = array[minIdx];
			array[minIdx] = array[i];
			array[i] = buffer;			
		}
	}
	
	public static void insertSort(int[] array){
		int buffer;
		for(int i=1; i<array.length;i++){
			buffer=array[i];
			int j=i-1;
			while(j>=0 && buffer<array[j]){
				array[j+1]=array[j];
				j--;
			}
			array[j+1] = buffer;
		}
	}
	
}