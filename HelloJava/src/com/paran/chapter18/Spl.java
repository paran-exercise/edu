package com.paran.chapter18;

public class Spl {
		 
		    public static void main(String[] args) {
		        String str1 = "일과/ 놀이 /사이에는 경계가 없다.";  
		        String[] words = str1.split("/");   // 자를 기호  split을 사용 ("기호")  
		         
		        for (String wo : words ){      // 배열 조건 출력  ( : )
		            System.out.println(wo);
		        }
		    }
	
	}


