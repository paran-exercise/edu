package com.paran.nested;

class Student{
	
	String name;
	int score;
	
	public Student(String name, int score){
		this.name = name;
		this.score =  score;
	}
	
}

interface IInterface{
	public abstract boolean test(Student stu);
}

public class NestedDemo {
	
	public static void main(String[] args){
		Student[] stuArr = new Student[3];
		stuArr[0] = new Student("홍길동", 100);
		stuArr[1] = new Student("임꺽정", 40);
		stuArr[2] = new Student("변사또", 50);
		
		checkGreaterThanFifty(stuArr, new IInterface(){
			public boolean test(Student stu){
				if(stu.score>=50)	return true;
				return false;
			}//함수형 프로그래밍
		});
		
	}
	
	public static void checkGreaterThanFifty(Student[] stuArr, IInterface tester){
		for(Student ele : stuArr){
			if(tester.test(ele)){
				System.out.println(ele.name);
			}
		}
	}
}
