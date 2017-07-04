package com.paran.chapter13;


// 
public class VariableLength {

	public static void main(String[] args) {
   
	// 배열의 	
		
	int[][] variablelength = {{10,20},{1,2,3,4},{1,2,6},{1,2,3}};
	
	for(int i = 0;i<variablelength.length;i++){
		System.out.println(i+1+" 번째의 배열의 길이는" +variablelength[i]+"입니다");
		}
	}

}
