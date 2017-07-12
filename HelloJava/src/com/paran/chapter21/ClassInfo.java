package com.paran.chapter21;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClassInfo {
	
	List<Student> stuList = new ArrayList<Student>();
	String name;
	String stuId;
	int korScore;
	int engScore;
	String domeFore;
	
	public void initStudent(){
		String filePath = "C:\\Users\\2강005\\git\\edu\\HelloJava\\src\\com\\paran\\chapter21\\classinformation.txt";
		
		try{
			BufferedReader readClassInfo = new BufferedReader(new FileReader(filePath));
			
			String inform;
			
			while ((inform = readClassInfo.readLine())!=null){
				String[] read = inform.split(";");
				
				stuId = read[0];
				name = read[1];
				korScore = Integer.parseInt(read[2]);
				engScore = Integer.parseInt(read[3]);
				domeFore =read[4];
				
				if(read[4].equals("D")){
					stuList.add(new DomeStudent(stuId,name,korScore,engScore,domeFore));
				}else{
					stuList.add(new ForeStudent(stuId,name,korScore,engScore,domeFore));
				}
				
			}
			readClassInfo.close();
		}		
		catch(IOException e){
			
		}
	}
	public void rankStudent(List<Student> stuList){
		ClassInfo obj = new ClassInfo();
		obj.stuList = stuList;
		
	}
	public static void main(String[] args){
		
		ClassInfo classInfo = new ClassInfo();
		
		classInfo.initStudent();
		
		Collections.sort(classInfo.stuList, new Descending());
		for(Student ele : classInfo.stuList){
			ele.showInfo();
		}
				
		System.out.println("");
	}
	
	
}


abstract class Student{
	private String name;
	private String stuId;
	private int korScore;
	private int engScore;
	private int sumScore;
	private float avgScore;
	private int rankClassStu;
	
	public int getSumScore() {
		return sumScore;
	}
	public void setSumScore() {
		this.sumScore = korScore + engScore;
	}
	public float getAvgScore() {
		return avgScore;
	}
	public void setAvgScore() {
		this.avgScore = sumScore/2;
	}
	public int getRankClassStu() {
		return rankClassStu;
	}
	public void setRankClassStu() {
		this.rankClassStu = rankClassStu;
	}

	
//	private String resiId;
		
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
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public abstract void showInfo();//abstract멤버 함수가 존재하는 클래스는 abstract클래스
	
}
class DomeStudent extends Student{
	private String resiId;
	public DomeStudent(){
		
	}
	public DomeStudent(String stuId, String name, int korScore, int engScore, String domeFore) {
		super();
		setName(name);
		setStuId(stuId);
		setKorScore(korScore);
		setEngScore(engScore);
		setSumScore();
		setAvgScore();
		this.resiId=domeFore;
	}
	public void showInfo(){//abstract 함수를 상속받을때 구현하지 않으면 abstract클래스됨
		System.out.println("name => "+getName() +" stuId =>"+getStuId()+" korScore =>"+getKorScore()+" engScore => "+getEngScore()+" sumScore => "+getSumScore()+" avgScore =>"+getAvgScore()+" resiId => "+resiId);
	}
}

class ForeStudent extends Student{
	private String foreId;
	public ForeStudent(){
		
	}
	public ForeStudent(String stuId, String name, int korScore, int engScore, String domeFore){
		super();
		setName(name);
		setStuId(stuId);
		setKorScore(korScore);
		setEngScore(engScore);
		setSumScore();
		setAvgScore();
		this.foreId=domeFore;
	}
	public void showInfo(){
		System.out.println("name => "+getName() +" stuId =>"+getStuId()+" korScore =>"+getKorScore()+" engScore => "+getEngScore()+" sumScore => "+getSumScore()+" avgScore =>"+getAvgScore()+" foreId => "+foreId);	}
}

class Descending implements Comparator<Student>{
	
	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getAvgScore() > o2.getAvgScore() ? -1 : o1.getAvgScore() > o2.getAvgScore() ? 1:0;
	}
	
}
