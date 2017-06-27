package com.paran.chapter3;

public class CastingDemo {
	// 1번, 인스턴스 변수 선언
	int num1;
	long num2;
	float num3;
	
	public static void main(String[] args) {
//		num1 = 1;	// 클래스 함수 내에선 인스턴스 변,함수를 쓸수 없다.
//		num2 = 1;
		CastingDemo Inst = new CastingDemo();		// 2번째, main 클래스에 인스턴스 생성
		
		Inst.num1 = (int)2147483647;		// 3번째, 1번에서 선언된 변수에 값을 Assign(할당)
		Inst.num2 = 1000000000000000000L;
		Inst.num3 = (float)12.45;
	}
}

class StudentScore {
	int engScore;
	int korScore;
	String stuName;
	
	public StudentScore(String stuName, int engScore, int korScore) {
		this.stuName = stuName;
		this.engScore = engScore;
		this.korScore = korScore;
	}
	
	public void showInfo() {
		System.out.println("************ 정보 출력 ************");
		System.out.println("이름 : " + stuName);
		System.out.println("영어점수 : " + engScore);
		System.out.println("국어점수 : " + korScore);
		System.out.println("************ 정보 출력 종료 ************");
	}
	
	public double getMsg() {
		return (engScore+korScore)/2.0;
	}
}

class OperaterDemo {
	public static void main(String[] args) {
		StudentScore obj1 = new StudentScore("홍길동", 80, 100);
		StudentScore obj2 = new StudentScore("임꺽정", 40, 50);
		StudentScore obj3 = new StudentScore("변사또", 80, 80);
		int a = 1;
		int b = 2;
		int sum = a-- + 3;
		
		a += 1+2;
		
		System.out.println(sum);
		System.out.println(a);
		
/*		obj1.showInfo();
		obj2.showInfo();
		obj3.showInfo();
		
		
		if(obj1.getMsg() >= 90.0 && obj1.getMsg() <= 100.0) {
			obj1.showInfo();
		}
		if(obj2.getMsg() >= 90.0 && obj2.getMsg() <= 100.0) {
			obj2.showInfo();
		}
		if(obj3.getMsg() >= 90.0 && obj3.getMsg() <= 100.0) {
			obj3.showInfo();
		}*/
	}
	// 생성자
	public OperaterDemo(){
		
	}
}