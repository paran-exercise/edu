package com.paran.chapter5;

public class BreakContinueDemo {
	public static void main(String[] args){
		
		int count = 3;
		
//		for(int i = 0 ; i < count ; i++){
			
//			if(i==5){
//				break;
//			}
//			if(i != 0 && i%2 == 0){
//				
//			}
			
//			if(i == 0 || i%2 != 0 ){
//				continue;
//			}
//			
//			System.out.println("2배수 "+i);
//			if(i%2==0){
//				
//				continue;
//			}
		
		for(int i = 1 ; i < count ; i++){
			
			for(int j = 1 ; j < count ; j++){
				if( i == 2) break;
				System.out.println("inner j" + j);
			}
			System.out.println("outer i" + i);
		}
		
	
	}
}
