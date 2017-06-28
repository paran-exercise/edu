package com.paran.chapter13;


/*=========== [] Array Statement  ============ 
 	자료형 [] 변수명 = new 변수명(생성객체 );  
	int []numArr = new int(9);

 ===========================================
 type [] varialbe = new type[];

 ==========================================
  배열 생성과  생성된 배열 값 할당 
 ex) float[] value1 = new float[4]; 
       value1[0] = 23.46f


  배열 기반 변수 사용방법 

 	for(int i=0;i<10; i++);
	{ 
  	numArr[i]=11;
	}

/*  배열 통한 더하기 or  반복 출력 
 * 
 *  1.6명의 값을 배열 생성 2.  for 문을 통해 6명의 점수를 출력한다. 
*/

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		int[] score = new int[6];

		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		score[4] = 50;
		score[5] = 60;

		// for문 사용 시 조건 () 이후에 ; 실행하면 단 한번 실행되므로 주의해야 한다. 
		
		for (int i= 0; i<6; i++)
		{
			System.out.println(i+1+"번째의 사람의 점수는"+score[i]+"입니다");
		}

	}

}
