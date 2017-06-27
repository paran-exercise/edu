package com.paran.chapter5;

public class Student
{
	private String name;
	private String StudentId;
	private boolean isMilSer; //전역여부
	
//	public Student(){
//	}
	
	public Student(String name,String StudentId,boolean isMilSer){
		this.name = name;
		this.StudentId = StudentId;
		this.isMilSer = isMilSer;
	}
	public void showInfo(){
	System.out.println("이름:" + name+ "학번 " + StudentId);
	}
	
	//getter function  Statement 
	
	
	
	public boolean getIsMilser(){
		return isMilSer;
	}
	
	public void setIsMilser(boolean isMilSer) {
		
	}
}
