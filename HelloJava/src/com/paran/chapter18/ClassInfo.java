package com.paran.chapter18;

import java.util.ArrayList;
import java.util.List;

public class ClassInfo {
	//학급정보
	//
	List<Student> stuList = new ArrayList<Student>();
	public void initStudent(){
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new ForeStudent());
		stuList.add(new ForeStudent());
		stuList.add(new ForeStudent());
		stuList.add(new ForeStudent());
	}
}
abstract class Student{
	private String name;
	private String stuId;
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
	public abstract void showInfo();//abstract멤버 함수가 존재하는 클래스는 abstract클래스
	
}
class DomeStudent extends Student{
	private String resiId;
	public void showInfo(){//abstract 함수를 상속받을때 구현하지 않으면 abstract클래스됨
		System.out.println("name => "+getName() +" stuId =>"+getStuId()+"resiId=> "+resiId);
	}
}
class ForeStudent extends Student{
	private String foreigId;
	public void showInfo(){
		System.out.println("name=> "+getName()+" stuId=> "+getStuId()+" foreigId=> "+foreigId);
	}
}