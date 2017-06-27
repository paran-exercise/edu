package com.paran.chapter5;

public class ControlStatementDemo {
	public static void main(String[] args) {
		Student[] stuArr = new Student[3];
		stuArr[0] = new Student("홍길동", "201600001", true);
		stuArr[1] = new Student("임꺽정", "201600002", false);
		stuArr[2] = new Student("변사또", "201600003", true);
		
//		int j = 0;
//		while(j < stuArr.length) {
//			stuArr[j].showInfo();
//			j++;
//		}
		
		for(Student stu : stuArr) {
			if(stu.getisMilSer()) {			// if(stu.getisMilSer() == true)와 같은 문장임.
				stu.showInfo();
			}
		}		
//		// 반복문
//		for(int i = 0; i < stuArr.length; i++) {
//			if(stuArr[i].getisMilSer()) {		// if(stuArr[i].getisMilSer() == true)와 같은 문장임. 
//				stuArr[i].showInfo();
//			}
//		}
}


}