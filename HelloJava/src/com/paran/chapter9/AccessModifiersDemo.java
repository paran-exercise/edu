package com.paran.chapter9;
import com.paran.chapter7.Student;

public class AccessModifiersDemo {
	public static void main(String[] args) {
		Student stuobj = new Student("1", "2", true);
		stuobj.showInfo();
	}
}