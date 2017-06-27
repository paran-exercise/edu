package com.paran.chapter5;

public class ControlStatementDemo {
	//if조건 판별 
	//boolean isMilSer
	public static void main(String[] args){
		
		Student[] stuArr = new Student[3];//배열 참조변수
		stuArr[0] = new Student("홍길동", "201600001", true);//인스턴스생성시 멤버변수에 접근 x
		stuArr[1] = new Student("임꺽정", "201600002", false);
		stuArr[2] = new Student("변사또", "201600003", true);
		
//		int j=0;
//		while(j < stuArr.length){
//			stuArr[j].showInfo();
//			j++;
//		}
		
		for(Student stu : stuArr){
			if(stu.getIsMilSer()){
				stu.showInfo();
			}
		}
		
//		for(int i=0;i<stuArr.length;i++){ //for(초기화; 조건문; 증감)
//			if(stuArr[i].getIsMilSer()){
//				stuArr[i].showInfo();
//			}			
//		}
		
	
	}

}

