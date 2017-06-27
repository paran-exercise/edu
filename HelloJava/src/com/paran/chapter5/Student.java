package com.paran.chapter5;

public class Student{
		private String name;	  // 이름
		private String stuId;     // 학번
		private boolean isMilSer; // 전역여부
		
//	Scanner sc = new Scanner(System.in);
		
//		public Student(){
//			
//		} 
			
		public Student(String name,String stuId,boolean isMilSer){
			
			this.name = name;
			this.stuId = stuId;
			this.isMilSer = isMilSer;
			
		}
		
		public void showInfo(){
			System.out.println("이름 : "+name+"\t학번 : "+stuId);
		}
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStuId() {
			return stuId;
		}

		public void setStuId(String stuId) {
			this.stuId = stuId;
		}

		public boolean getIsMilSer(){
			return isMilSer;
		}
		
		public void setIsMilSer(boolean isMilSer){
			this.isMilSer = isMilSer;
		}
				
	}