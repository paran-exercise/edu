package com.paran.chapter18;

import java.util.ArrayList;
import java.util.List;

/* abstract  구현체 없다. 인스턴스 만들지 못한다. 
 *  파일로 부터 정보를 입력받는데 텍스트 파일로 전달 받습니다. 
 *  외국인,내국인 구분  입력받아서 이 타입  1,2로 구분  
 *  리스트에 저장한다. > 전체순위를 가지고 있는 클래스를 
 *  Classinfo (해당 학번 점수, 순위 or 평균 , )  정보를 가지고 있다 "  
 * 
*/

public class ClassInfo {
	List<Student> stuList = new ArrayList<Student>();  /// 스튜던드라는 클래스 자료형을  
	public void initStudent(){
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
		stuList.add(new DomeStudent());
	}
}

abstract class Student{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStuid() {
		return stuid;
	}
	public void setStuid(String stuid) {
		this.stuid = stuid;
	}
	private String stuid;
	public abstract void showInfo();
		
}

class DomeStudent extends Student {
	String resitiD;
	
	public void showInfo(){
		System.out.println(name+stuid+resitiD); 
		// 이름과 학생 + 주민번호 
	}
}
	
class foreStudent extends Student {
	String foreignId;
	public void showInfo(){
		System.out.println(name+stuid+foreignId); 
	}
}
	
	
	
	//상속을 받아서  국내 학생 주민번호  
	// 외국인 학생은  외국인 번호 
	
	
	

	
	
	

