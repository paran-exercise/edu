
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
		
		
		// BufferedReader 입력을 받는 함수 
		// new InputStreamReader 입력받아 출력받는 함수 
		// System.in 두개의 함수를 사용할 수 있는 표준 라이브러리 
		
		/*
		 * System 클래스(표준 입출력) : System.in, System.out, System.err

JAVA에서는 스크린과 키보드를 통한 입출력 방법인 표준 입출력을 제공한다. 
표준 입출력을 제공하는 클래스는 java.lang.System으로 멤버 변수인 in, out, err을 이용해서 표준 입력, 표준 출력, 표준 에러를 제공한다.

1. System.in


System.in은 InputStream 형태로 지정되어 있다. 
System 클래스는 자바 버추얼 머신을 구성하고 있는 표준 장치를 뜻하는 클래스이다. 
자바 버추얼 머신은 그 자체가 완벽한 하나의 컴퓨터 플랫폼을 가정하고 있기 때문에 
독립적으로 동작할 수 있는 구조를 표현하기 위하여 표준 입력과 표준 출력을 스스로의 System 클래스에 등록하여 사용한다.
여기에서 주목해야 할 부분은 System.in 변수의 타입이 InputStream 이라는 점이다.

InputStream 클래스는 최상위 클래스이면서 추상 클래스이다. 
따라서 InputStream은 객체를 생성할 수 없는 클래스이다.
http://hyeonstorage.tistory.com/235 [개발이 하고 싶어요]
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
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
