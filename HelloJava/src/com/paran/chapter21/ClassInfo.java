package com.paran.chapter21;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClassInfo {
	
	List<Student> stuList = new ArrayList<Student>();
	String name;
	String stuId;
	int korScore;
	int engScore;
	String resiId;
	
	public void initStudent(){
		String filePath = "C:\\Users\\mycub\\git\\edu\\HelloJava\\src\\com\\paran\\chapter21\\classinformation.txt";
		ClassInfo obj = new ClassInfo();
		try{
			BufferedReader readClassInfo = new BufferedReader(new FileReader(filePath));
			
			String inform;
			
			while ((inform = readClassInfo.readLine())!=null){
				String[] read = inform.split(";");
				
				stuId = read[0];
				name = read[1];
				korScore = Integer.parseInt(read[2]);
				engScore = Integer.parseInt(read[3]);
				resiId =read[4];
				
				if(read[4].equals("D")){
					stuList.add(new DomeStudent(stuId,name,korScore,engScore,resiId));
				}else{
					stuList.add(new ForeStudent(stuId,name,korScore,engScore,resiId));
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
		this.avgScore = sumScore / 2;
	}
	public abstract void showInfo();//abstract멤버 함수가 존재하는 클래스는 abstract클래스
	
}
class DomeStudent extends Student{
	private String resiId;
	public DomeStudent(){
		
	}
	public DomeStudent(String stuId, String name, int korScore, int engScore, String resiId) {
		super();
		setName(name);
		setStuId(stuId);
		setKorScore(korScore);
		setEngScore(engScore);
		this.resiId=resiId;
		setSumScore();
		setAvgScore();
	}
	public void showInfo(){//abstract 함수를 상속받을때 구현하지 않으면 abstract클래스됨
		System.out.println("name => "+getName() +" stuId =>"+getStuId()+"korScore =>"+getKorScore()+"engScore =>"+getEngScore()+"resiId => "+resiId +"sumScore =>"+getSumScore()+"avgScore =>"+getAvgScore());
	}
}
class ForeStudent extends Student{
	private String resiId;
	public ForeStudent(){
		
	}
	public ForeStudent(String stuId, String name, int korScore, int engScore, String resiId){
		super();
		setName(name);
		setStuId(stuId);
		setKorScore(korScore);
		setEngScore(engScore);
		this.resiId=resiId;
		setSumScore();
		setAvgScore();
	}
	public void showInfo(){
		System.out.println("name => "+getName() +" stuId =>"+getStuId()+"korScore"+getKorScore()+"engScore"+getEngScore()+"resiId=> "+resiId+"sumScore =>"+getSumScore()+"avgScore =>"+getAvgScore());
	}
}
class AscendingObj implements Comparator<Student>{

	@Override
	public int compare(Student arg0, Student arg1) {
		// TODO Auto-generated method stub
		return (int)arg0.getAvgScore().comparTo((int)arg1.getAvgScore());
	}
	
}
