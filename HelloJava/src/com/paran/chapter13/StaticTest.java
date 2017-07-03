package com.paran.chapter13;

class StaticTest {

		
	
	
		  static String name="홍길동";
		  String address="대한민국 순천시 조례동";
		  public void showAddress(){
		    System.out.println(address); // 가능
		  }
		  public static void showName(){
		    System.out.println(name); // 가능
		    System.out.println(address); // 불가능
		    System.out.println(this.name); // 불가능
		    showAddress(); // 불가능
		    
		    StaticTest obj = new StaticTest();
		    System.out.println(obj.address); // 불가능

		    
		  }
		
}
// 자기 클래스 내부에서 내 인스턴스 변수나 함수를 접근  
// 클래스 함수를 접근하는거 