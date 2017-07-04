package com.paran.chapter3;



//인스턴스 변수 선언 테스트 
// 지역 변수로 선언해서 테스트 하는 방법 
// 1. 변수 선언  (인스턴스 변수) >  클래스의  인스턴스 생성  >  변수를 생성 할당  


public class CastingDemo1 {

	// 클래스 변수 선언 //	
		
	int num1; 
	float num2;; 
	long num3;
	
	
	public static void main(String []args) {
	
		
	// 객체 생성// 	
			
		CastingDemo1 obj = new CastingDemo1();
			
	// 객체사용할 변수 대입// 	
		
		obj.num1 = 2;
		obj.num2 = 12.1f;
		obj.num3 = 12315400;	
 
			
		System.out.println("모두 합산한 결과는"+obj.num1+obj.num2+obj.num3); 	
	}
}


	class StudentScore{
		int engScore;
		int korsocre;
		String stuName;
	
	public StudentScore(String stuName,int korsocre,int engScore){
		this.stuName = stuName;
		this.korsocre = korsocre;
		this.engScore = engScore;
	}
	
	public void showInfo(){
		System.out.println("=====정보출력 시작 =======");
		System.out.println("이름"+stuName);
		System.out.println("국어점수"+korsocre);
		System.out.println("영어점수"+engScore);
	}
	
	public double getAvg(){
		return (engScore+korsocre)/2; 
	}	
}


// 3세람   90점 이상 " A " 인 사람만 정보를 출력해 주자. 90<= "A" , 

class OperatorDemo{
	public static void main(String[] args){

		StudentScore obj1 = new StudentScore("홍길동",100,80);
		StudentScore obj2 = new StudentScore("임꺽정",50,40);
		StudentScore obj3 = new StudentScore("변사또",80,80);
		
		obj1.showInfo();
		obj2.showInfo();
		obj3.showInfo();
		
		if (obj1.getAvg()>= 90.0 && obj1.getAvg()<=100.0){
			obj1.showInfo();
		}
	
		if (obj1.getAvg()>= 90.0 && obj2.getAvg()<=100.0){
			obj1.showInfo();
		}
		
		if (obj1.getAvg()>= 90.0 && obj3.getAvg()<=100.0){
			obj1.showInfo();
	}

}
	
}
