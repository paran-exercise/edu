package com.paran.chapter9;

import com.paran.chapter7.Student;

public class UniStudent extends Student{//student 생성자 함수// Student에 기본생성자
	public UniStudent(String stuName, String stuId, boolean isMilSer){
		
		//superclass의 생성자함수 호출
		super(stuName, stuId, isMilSer);
		
	}
	
	public void showInfo(){
		super.showInfo();//부모의 필드 인스턴스 호출
		System.out.println("제대여부 : "+isMilSer);
		
				
	}
	
	public static void main(String[] args){
		UniStudent obj=new UniStudent("1", "2", false);
		obj.showInfo();
	}
}
