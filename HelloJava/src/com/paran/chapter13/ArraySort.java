package com.paran.chapter13;
import java.io.*;
/*
 * 
입력자에게 출력을 받아 
받은 수를 정렬하기 


1. BufferedReader 입력 받기 
2. 입력변수 선언 > 배열 생성 
3. 내용 출력 : 명의 점수가 입력되었습니다. 
4. for문 >> 스트링 저장 변수 선언 
 - 변수배열로 들어간 = parseInt 정수로 변환 

5. for문을 통해 입력받은 점수를 정렬 
  비교 정렬한다. 

  2중 포문을 통해 2개의 배열의 값을 비교
  2개 중에서 하나의 큰 값과 작은 값을 
  치환하여  정렬하는 방식. 

 변수 temp , front, rear 
 

 포문에서 배열에 들어갈 첫번재와 두번째  선언 
 * 
 * 
 * 
 * 
 */


public class ArraySort {
public static void main(String[]args) throws IOException{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("점수를 입력해 주세요.");
	
	//생성할 배열 지정 
	// type[] !variableName! = new type [n]; 
	// 배열선언 시에 변수명 같이 선언해서 초기화  가능. 
	int[] point = new int[5];
	for(int i = 0;i<point.length;i++){
	System.out.println(i+"번째의 점수 입니다.");
	
	

    // 타입/사용변수이름 =  입력받을 변수이름.입력올 함수명();
	String msg = br.readLine();
	point[i] = Integer.parseInt(msg);
	}
	
	for (int b=0;b<point.length-1;b++){
		for (int a=0;a<point.length;a++){
			if (point[b] < point[a]){
				int temp = point[b];  // 에프터한 수를 임시저장 위치에 할당 
				point[b] = point[a]; // 큰수를 작은 수에 할당  
				point[b] = temp;     // 임시저장 
			}
		}
	}
		
	for (int t = 0; t<point.length;t++){
		System.out.println((t+1)+"번째의 점수는"+point[t]+"입니다");
		
		}
	}
}
