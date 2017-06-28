package com.paran.chapter5;

public class ControlStatementDemo {
	public static void main(String[] args){
		Student[] stuArr = new Student[3];
		
		stuArr[0] = new Student("홍길동","2001600001", true);
		stuArr[1] = new Student("임꺽정","2001600002", false);
		stuArr[2] = new Student("변사또","2001600003", true);
		
//		stuArr[0].name = "홍길동";
//		stuArr[0].stuId = "5001939846";
//		stuArr[0].isMilSer = false;
//		int j = 0;
//		while(j < stuArr.length ){
//			if(stuArr[j].getIsMilSer()){
//				stuArr[j].showinfo();
//				System.out.println("다녀옴");
//			}else{
//				stuArr[j].showinfo();
//				System.out.println("안다녀옴");
//			}
//			j++;
		for(Student stu : stuArr){
			if(stu.getIsMilSer()){
				stu.showinfo();
				System.out.println("다녀옴");
			}
		}
		
	
//반복문		
//		for(int i = 0; i < stuArr.length; i++){
//			if(stuArr[i].getIsMilSer()){
//				stuArr[i].showinfo();
//				System.out.println("다녀옴");
//			}else{
//				stuArr[i].showinfo();
//				System.out.println("안다녀옴");
//				
//			}	
//			}
	}
	
}
