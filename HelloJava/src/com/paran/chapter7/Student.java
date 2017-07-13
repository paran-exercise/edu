package com.paran.chapter7;

public class Student{
	
	String stuName;
	String stuId;
	protected boolean isMilSer;
	
	
	
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
