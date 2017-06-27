package com.paran.chapter5;

public class SwitchDemo {
	
	public static void main(String[] args){
		int month = 13;
		String monthString;
		String quarter;
		
		switch(month){
		case 1:
			monthString ="January";
			break;
		case 2:
			monthString ="February";
			break;
		case 3:
			monthString ="March";
			break;
		case 4:
			monthString ="April";
			break;
		case 5:
			monthString ="May";
			break;
		case 6:
			monthString ="Jun";
			break;
		case 7:
			monthString ="July";
			break;
		case 8:
			monthString ="August";
			break;
		case 9:
			monthString ="September";
			break;
		case 10:
			monthString ="October";
			break;
		case 11:
			monthString ="November";
			break;
		case 12:
			monthString ="December";
			break;
		default:
			monthString ="Undefined";
			
		}
		System.out.println(monthString);
		
		if(month>=1 && month<=3){
			quarter ="1/4";
		}else if(month>=4 && month<=6){
			quarter ="2/4";
		}else if(month>=7 && month<=9){
			quarter ="3/4";
		}else if(month>=10 && month<=12){
			quarter ="4/4";
		}else{
			quarter="undefined";
		}
		System.out.println(quarter);
		switch(month){
		case 1:
		case 2:
		case 3:
			quarter="1/4";
			break;
		case 4:
		case 5:
		case 6:
			quarter="2/4";
			break;
		case 7:
		case 8:
		case 9:
			quarter="3/4";
			break;
		case 10:
		case 11:
		case 12:
			quarter="4/4";
			break;
		default :
			quarter="undefined";
		}
		System.out.println(quarter);

	}

}
