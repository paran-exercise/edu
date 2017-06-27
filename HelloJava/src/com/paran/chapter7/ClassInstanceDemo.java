package com.paran.chapter7;
import com.paran.chapter5.Student;
public class ClassInstanceDemo {
	public static void main(String[] args){
		int i=1;	
		Student obj = null;
		i++;
		i++;
		i++;
		i++;
		if ( i > 10 ){
			obj = new Student("홍길동","1324",true);
		}
		System.out.println(obj.getIsMilSer());
				
		
	}

	
}