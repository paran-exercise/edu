package com.paran.chapter9;
import com.paran.chapter7.Student;
public class UniStudent extends Student{
	public UniStudent(String name, String stuId,  boolean isMilSer){
		super (name,stuId,isMilSer);
	}
	public void showInfo(){
		super.showinfo();
		System.out.println("제대여부 " + isMilSer); 
	}
}
