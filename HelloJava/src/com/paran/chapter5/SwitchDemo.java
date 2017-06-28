package com.paran.chapter5;
import java.util.Scanner;
public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		int m = sc.nextInt();
		String monthstring = " ";
		
		switch(m)
		{
		case 1: monthstring = "January";
		break;
		case 2: monthstring = "February";
		break;
		case 3: monthstring = "March";
		break;
		case 4: monthstring = "April ";
		break;
		case 5: monthstring = "May";
		break;
		case 6: monthstring = "June";
		break;
		case 7: monthstring = "July";
		break;
		case 8: monthstring = "August";
		break;
		case 9: monthstring = "September ";
		break;
		case 10: monthstring = "October";
		break;
		case 11: monthstring = "November ";
		break;
		case 12: monthstring = "December";
		break;
		default: monthstring = "몰라요";
			
		}
		    
		System.out.println("이번달은 " + monthstring +"입니다");
	}

}
