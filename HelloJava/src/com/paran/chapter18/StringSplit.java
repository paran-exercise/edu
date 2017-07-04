package com.paran.chapter18;

public class StringSplit {

	public static void main(String[] args) {
		
		class split{
		
		String split1 = "수학/영어/과학/몰라";{
		String arr[] = split1.split("/");
		
		for (int i = 0;i<arr.length;i++){
			System.out.println("arr["+i+"]>> "+ arr[i]);
				}
			}
		}
	}
}