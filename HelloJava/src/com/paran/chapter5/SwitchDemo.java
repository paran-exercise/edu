package com.paran.chapter5;


/*========================================
/   Switch construction
 *
 *  switch(n)
 *  {
 *  case 1:
 *  ......
 *  break;
 *  
 *  case 2:
 *  ......
 *  break;
 *   . 
 *   .
 * default; 
 * 
 * 
 * break가 없는 경우  아래 실행문에 따라 전부 실행된다. 
 * 
 * ======================================
*/

public class SwitchDemo {


	public static void main(String[] args) {

//	      int Day = 3;
//	      String DayString;
//	      switch (Day)
//	        
//	        {
//	            case 1:  DayString = "monday";
//	                     break;
//	            case 2:  DayString = "thusday";
//	                     break;
//	            case 3:  DayString = "Wednesday";
//	                     break;
//	            case 4:  DayString = "Thursday";
//	                     break;
//	            case 5:  DayString = "Friday";
//	                     break;
//	            case 6:  DayString = "Saturday";
//	                     break;
//	            case 7:  DayString = "Sunday";
//	                     break;
//	 
//	            default: DayString = "Invalid day";
//	                     break;
//	        }
//	        System.out.println(DayString);
//	    }
//	}
//			
//

		int month = 1;
		String monthString;
		switch (month) {
		
		case 1: 
		case 2: 
		case 3: 
			monthString = "1/4 quarter";
		break; 
			
		case 4: 
			monthString = "April";
		break; 
		
		case 5: 
			monthString = "May";
		break; 
		
		case 6: 
			monthString = "June";
		break; 
		
		case 7: 
			monthString = "July";
		break; 
		
		case 8: 
			monthString = "August";
		break; 
		
		case 9: 
			monthString = "September";
		break; 
		
		case 10: 
			monthString = "October";
		break; 
		
		case 11: 
			monthString = "November";
		break; 
		
		case 12: 
			monthString = "December";
			break; 
		
		default: monthString = "Invalid month";
		 	break;
		
		}
		System.out.println(monthString);
	}
	
}	
		






		// int  타입으로 변수 할당  > String 변수 지정 > Switch int 변수 사용 > 
		// case 문에서 String 사용한 변수 이름으로  출력 이름 사용 
		
		
//		int fname = 2;
//		String firstname;
//		switch (fname) {
//		
//		case 1: 
//			firstname = "kim"; 
//			break; 
//			
//		case 2: 
//			firstname = "Lee"; 
//			break; 	
//			
//		case 3: 
//			firstname = "park"; 
//			break; 	
//		
//			default : 
//			firstname = "etc"; 
//			break;	
//		}
//			System.out.println(firstname);
//	}
//		
//}

		 
		
		 