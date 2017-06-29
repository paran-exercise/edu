package com.paran.chapter13;

public class ArrayDemo {
	
	
	public static void main(String[] args) {
		
		ArrayDemo arr = new ArrayDemo();
		int[] num = new int[10];
				
		for(int i = 0;i<num.length;i++){
			num[i]=i+1;
			System.out.print(num[i]+"\t");
			
		}
		System.out.println();
		arr.reverseArrayValue(num);
		
		
	}
	
	
	public void reverseArrayValue(int[] array){
		
		int temp=10;
//		int temp;	
		
		for(int i = 0; i < array.length; i++){      
			
//		 for(int j = 0; j < array.length; j++){
							
				array[i]=temp;
				temp--;
				
//				if(array[i]<array[j]){
//					temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//					
//				}	
				
//		 }
			
		 System.out.print(array[i]+"\t");
			
		}
	}
}
		
		

			
		

	


