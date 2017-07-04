package com.paran.chapter13;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		int result = (1 > 3) ? 1 : (1 > 2) ? 1 : 2;
		System.out.println(result);
	}
}