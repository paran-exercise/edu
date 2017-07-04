package com.paran.chapter5;

// 학생 클래스, 제대 여부 멤버변수 
// boolean is MiliSer 
// Class : 
// instance : 남자 2명, 여성 2명 
// 예비군 대상자를 리스트 : 이름과 학번을 출력 

public class ControlStateMentDemo {	
	public static void main(String[]args){
	
		
// ========Array constructor =======
// 배열 [] 배열 변수명 = new type명 []; 
// =================================
		
		
		
		
		Student[]  stuArray = new Student[3];
		stuArray[0] = new Student("김명수", "20170001", true);
		stuArray[1] = new Student("가짜사나이", "20170002", false);	
		stuArray[2] = new Student("진짜사나이", "20170003", true);

/*  for statement 
 초기화,조건,반복 
 * 배열의 인덱스를 사용할 경우  관계연산자의 인덱스를 초과하면 안된다. 
 *
*/
//		int j = 0;
//		while(j < stuArray.length) {
//				stuArray[j].showInfo(); 
//				j++; 
//		}
//		 
		
//		for(int i=0; i<stuArray.length; i++){
//			// if문에서 ! 부정하여 false /  
//			if (stuArray[i].getIsMilser() ) {
//				stuArray[i].showInfo();
//				
//			}
//			
//		}
	
		for (Student stu : stuArray) {
			if (stu.getIsMilser()) {
				stu.showInfo();
		
									}
								  }
	}
}
	
////접근지정자. Access Modifier 
//변수나 함수에 접근 가능한 제한 
//
//private : 내 클래스 안에서만
//public: 전 월드에서 사용 가능. 

	