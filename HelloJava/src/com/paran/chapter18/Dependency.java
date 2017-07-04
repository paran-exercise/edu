package com.paran.chapter18;

public class Dependency {
	
	public void showInfo(Student instStu){
		System.out.println(instStu.getInfo());
	}

}

class Association{
	private Student stuId;
}

class Student{
	String name;
	String stuId;
	
	public Student(String name, String stuId){
		this.name = name;
		this.stuId = stuId;
	}
	public String getInfo(){
		return name +" "+ stuId;
	}
}