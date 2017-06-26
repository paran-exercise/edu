package com.paran.chapter3;

public class CastingDemo {
	//instance 변수
	int num1;
	long num2;
	float num3;
	
	long num4;
	float num5;
	
	//클래스 함수 
	public static void main(String[] args){
		
		CastingDemo obj = new CastingDemo();//obj 지역변수
		
		obj.num1 = -2147483648;
		obj.num2 = 1000000000000000000L;//
		obj.num3 = 12.45F;
		
		obj.num4 = 10000000000L;
		obj.num5 = 12.45f;
		
		
	}

}
class StudentScore{
	
	int engScore;
	int korScore;
	String stuName;
	
	public StudentScore(String stuName, int korScore, int engScore){
		this.stuName=stuName;
		this.korScore=korScore;
		this.engScore=engScore;
	}
	public void showInfo(){
		System.out.println("===========정보출력 시작=========");
		System.out.println("이름 : "+stuName);
		System.out.println("영어점수 : "+engScore);
		System.out.println("국어점수 : "+korScore);
		System.out.println("===========정보출력 종료=========");
	}
	public double getAvg(){
		return (engScore+korScore)/2.0;//실수형 표현시 .0 / 산술연산
	}
}
//세사람에 대한 인스턴스 생성/정보출력/세사람중 A받는사람
class OperatorDemo{

	public OperatorDemo(){
		
	}
	public static void main(String[] args){
		StudentScore obj1 = new StudentScore("홍길동",100,80);
		StudentScore obj2 = new StudentScore("임꺽정",50,40);
		StudentScore obj3 = new StudentScore("변사또",80,80);
		
		obj1.showInfo();
		obj2.showInfo();
		obj3.showInfo();
		
		if(obj1.getAvg()>=90.0 && obj1.getAvg()<=100.0){
			obj1.showInfo();						
		}
		if(obj2.getAvg()>=90.0 && obj2.getAvg()<=100.0){
			obj2.showInfo();						
		}
		if(obj3.getAvg()>=90.0 && obj3.getAvg()<=100.0){
			obj3.showInfo();						
		}
		int a=1;
		
		int sum =(a--) + 3;
		
		System.out.println(sum);
		System.out.println(a);
	}
}

