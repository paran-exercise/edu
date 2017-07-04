package com.paran.chapter18;

public class Dependancy {

	// 의존성 파라미터 참조할때 리턴타입일때   
	// Association : 멤버변수로 참조 하고 있을 때 
	public static void main(Student instStu) {
		System.out.print(instStu.getInfo());
	}
}

	class Association{
		private Student studentInfo;
	}
	

	class Student{
		String name;
		String struid;
		public Student(String name,String stuId){
		
			
			this.name = name;
			this.struid = stuId;
		}
		
		public String getInfo(){
			return name + ""+stuId;
			
		}
		
	}
	
	

