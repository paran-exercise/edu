package com.paran.chapter5;
public class Student{
	
	String stuName;
	String stuId;
	boolean isMilSer;
	
	public Student(){	//접근지정자 : 변수나 함수에 대한 접근을 제한할수있음 private class안에서만 접근 / public 모든 클래스에서 접근 가능

	}
	
	public Student(String stuName, String stuId, boolean isMilSer){
		this.stuName = stuName;
		this.stuId = stuId;
		this.isMilSer = isMilSer;
	}
	public void showInfo(){
		System.out.println("이름 : "+stuName+" 학번 :"+stuId);
	}
	public boolean getIsMilSer(){ //getter함수
		return isMilSer;
	}
	public void setIsMilSer(boolean isMilSer){ //setter함수
		this.isMilSer = isMilSer;
	}
	
}
