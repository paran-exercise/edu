package com.paran.chapter5;

public class Student {
	private String name;
	private String stuId;
	private boolean isMilSer;
	//기본 생성자 
//	public Student(){
//		 
//	 }
	// 파라미터 3개, 생성자	
	public Student(String name, String stuId,  boolean isMilSer){
	this.name = name;
	this.stuId = stuId;
	this.isMilSer = isMilSer;
	 }
	public void  showinfo(){
		System.out.println("이름 : " + name + "  학번 : " + stuId );
	}
	
	public boolean getIsMilSer(){
		return isMilSer;
	}
	
	public void setIsMilSer( boolean isMilSer){
		this.isMilSer = isMilSer;
		this.stuId = stuId;
	}
}
