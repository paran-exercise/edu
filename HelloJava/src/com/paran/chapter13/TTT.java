package com.paran.chapter13;


public class TTT {
	static class Car1 {
		
	private int num;
	private double gas;	

		void setNumgas(int n,double g){
	 
		num = n;
		gas = g;
		
		if (g>0 && g<1000){
				System.out.println("연료량을 바꾸겠습니다.");
		}
			else 
				System.out.println("올바른 연료량이 아닙니다.");
	 		}
	 
	  void show(){
		  System.out.println("차량의 번호는"+num+"입니다.");
		  System.out.println("차량의 가스는"+gas+"입니다.");
	  	  }	 
	
 

	
		  public static void main(String[] args) {
			Car1 car1 = new Car1();
			Car1 car2 = new Car1();
			
			car1.setNumgas(1234,-10.5);
			car2.setNumgas(1234,20.5);
			
			car1.show();
			car2.show();
			
			System.out.println("2번 차량의 연료양에 잘못된 값이 입력되었습니다.");
		 			}
				}
}
	
	

