package com.paran.chapter5;

/* ========= while construction ==================
 * 
 * 
 * while (조건) { 
 *  문장 
 * ....
 * 			   }	
 * =================================================
 * 
 * 
 * while 반복문 메서드 호출하여 사용하기! 
 * 
 *  <Step>
 *  클래스 함수 메서드 선언 >  객체화 > 클래스 변수 선언 > while 조건 내에서
 *  메서드 호출 > 
 * 
 *   !!! 개체화를 안했더니 메서드를 호출을 할 수 없었다. !!!! 
 *   객체화 멥버에 접근해서 메서드를 호출하는 방식을 사용. 
 * 
 */



public class WhileBasic 
{	
    public void iSay() {
			System.out.println("I do not want to repeat.");
	}

	
	//		int num = 0;  인스턴스 변수이므로  Static 함수내에서  사용불가. 
	
	public static void main(String[]args)
	{
		WhileBasic repeat1 = new WhileBasic();
		int num1= 0;
		
		while(num1<10)
		{
			repeat1.iSay(); 
			num1++;	
		}
				
	}
}


