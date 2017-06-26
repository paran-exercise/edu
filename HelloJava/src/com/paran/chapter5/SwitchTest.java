package com.paran.chapter5;

import java.io.*;

/*
 *  Switch construction
 *
 *  switch(n)
 *  {
 *  case 1:
 *  ......
 *  break;
 *  
 *  case 2:
 *  ......
 *  break;
 *   . 
 *   .
 * default; 
 * 
 * 
 */


/* 
 *  추가로 만들어 보고 싶은  것
 * 
 *  만약 입력 값이 1,2가 들어왔을 때   
 *  새로 입력을 받아 3,4가 들어왔을 때 종료되도록 수정. 
 * 
 *  ???
 *  제어문 if를 통해 입력값 변수가  1,2 들어올 때 
 *  입력과 케이스를 반복하는 for문으로  
 *  메서드를 호출하여 반복하는 것..  가능할 거 같음..
 * 
 * 
 * 
 * 
 */


public class SwitchTest {

	public static void main(String[] args)  throws IOException
	{
	
		System.out.println("Enter 1 to 4 AI State");
		
		BufferedReader input1 = new BufferedReader(new InputStreamReader(System.in));
		
		// Type varialbeName = object.ReadLine(methodName)(); 
		//  인스턴화하여 입력받은 문자를 사용할 변수 선
		
		String AiNo = input1.readLine();
		int AiStateNo = Integer.parseInt(AiNo);
		
		
		// 스위치를 받을 변수명 입력 
		
		switch(AiStateNo)
		{
		case 1:
			System.out.println("idle State");
			
			break;
		
		case 2:
			System.out.println("Battle State");
			break;
	
		
		case 3:
			System.out.println("rest State");
		break;
		
		default :
			System.out.println("Patrol State");
			
			

		}		
	}

}
