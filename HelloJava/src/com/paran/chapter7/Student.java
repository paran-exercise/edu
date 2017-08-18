package com.paran.chapter7;

public class Student {
	private String name;
	private String stuId;
	protected boolean isMilSer;		// 전역 여부
	
//	public Student() {
//	}
	// 파라미터 3개 생성자.
	public Student(String name, String stuId, boolean isMilSer) {
		this.name = name;
		this.stuId = stuId;
		this.isMilSer = isMilSer;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name + " 학번 : " + stuId);		
	}
	//Getter
	public boolean getisMilSer() {
		return isMilSer;
	}
	//Setter
	public void setisMilSer(boolean isMilSer) {
		this.isMilSer = isMilSer;
	}
}