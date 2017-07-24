package com.paran.chapter18;

interface Message {
	String greet();
}

public class My_Class {
	public void displayMessage(Message m) {
		System.out.println(m.greet() + ", This is an example of anonymous in");
	}
}
