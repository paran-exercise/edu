
package com.paran.chapter5;

// 2개의 입력을 받아 IF문으로 조건문으로 결과값 출력하기 
//
//
//  [[추후의 구성해 볼 리스트]] 
//  DB Tbl 연동 >  입력자의 정보 조희 > 테이블의 컬럼과 일치 불일치 >  결과값 출력 
//

import java.io.*;

public class IfMulityTest {

	
	
	public static void main(String[] args) throws IOException {

		System.out.println("생년월일을 입력하시오.");
		System.out.println("학번을 입력하시오.");
		
			BufferedReader input1 = 
			new BufferedReader(new InputStreamReader(System.in));
	
			BufferedReader input2 = 
			new BufferedReader(new InputStreamReader(System.in));
	
			String str1 = input1.readLine();
			int codeNo1 = Integer.parseInt(str1);
			String str2 = input2.readLine();
			int codeNo2 = Integer.parseInt(str2);
			
			if (codeNo1==820625)
				System.out.println("당신의 이름이 맞습니다.");
			else 
				System.out.println("잘못된 이름을 입력하였습니다.");
			
			if (codeNo2==28)
				System.out.println("당신의 학번이 맞습니다.");
			else 
				System.out.println("잘못된 학번이 입력되었습니다.");
		
		
	}

}
