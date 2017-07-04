package com.paran.chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자를 입력받는다. 
// 입력받은 값의 범위에 따라 결과가 출력되도록 한다. 
// 1~99999   설정 후  단위별 메세지 범위값 출력. 



public class IfMulityTest02 {

	public static void main(String[] args) throws IOException {

		System.out.println("1~99999 이하의 정수를 입력하시오.");

		
			BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));

			// 입력받을 변수 선언 
			
			String str = br.readLine();
			int num = Integer.parseInt(str);
			
			if(num>0 && num<100 )
				System.out.println("입력값은1~100  정수입니다.");
			
			else if(num<99 && num<1001)
				System.out.println("입력값은 100~1000  정수입니다.");				
			
			else if(num>999 && num<10001)
				System.out.println("입력값은 1000~ 10000  정수입니다.");	
			
			else 
				System.out.println("입력값은 만을 초과한 값입니다..");	

	}

}

