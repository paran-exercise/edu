package com.paran.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ClassInfo {
	static ArrayList<Student> stuList = new ArrayList<Student>();

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("c:/dev/asdq.txt"));
		int lineCount=0;
		String line;
		String[] splitLine = new String[10]; 		
		
		while((line = br.readLine()) != null){
			splitLine = line.split("_");
			
			if(splitLine[3].equals("Fore")){
				stuList.add(new ForeStudent(splitLine[4]));
			}else{
				stuList.add(new DomeStudent(splitLine[4]));
			}
			lineCount++;
		}
		
		br.close();
		br = new BufferedReader(new FileReader("c:/dev/asd.txt"));
		
		for(int i=0; (line = br.readLine()) != null; i++){		
			splitLine = line.split("_");
			
			stuList.get(i).setName(splitLine[0]);
            stuList.get(i).setStuID(splitLine[1]);
            stuList.get(i).avgScore(splitLine[4]);
            stuList.get(i).resi = splitLine[2];
		}
		br.close();
		
		
		Collections.sort(stuList);
		for(int i=0; i<lineCount; i++){
			(stuList.get(i)).showInfo();
		}
	}	
}

//=======================abstract==============================
abstract class Student implements Comparable<Student>{
	String name;
	String stuID;
	String resi;
	
	int engScore;
	int korScore;
	int proScore;
	int avg;
	
	public void setName(String name){
		this.name = name;
	}
	public void setStuID(String stuID){
		this.stuID = stuID;
	}
	public void avgScore(String scores){
		this.engScore = Integer.parseInt(scores.substring(0, 2));
		this.korScore = Integer.parseInt(scores.substring(2, 4));
		this.proScore = Integer.parseInt(scores.substring(4, 6));
		this.avg = (engScore+korScore+proScore)/3; 
	}
	public int compareTo(Student stu){
		return this.avg - stu.avg;
	}
	public abstract void showInfo();
}
//=======================abstract==============================

class DomeStudent extends Student{
	String resiID;
	
	public DomeStudent(String ID){
		resiID = ID;
	}	
	public void showInfo(){
		System.out.println("name =>"+name+" stuID =>"+stuID+" resiID =>"+resiID+" resi =>"+resi+" Average =>"+avg);
	}	
}

class ForeStudent extends Student{
	String foreignID;
	
	public ForeStudent(String ID){
		foreignID = ID;
	}
	public void showInfo(){
		System.out.println("name =>"+name+" stuID =>"+stuID+" foreignID =>"+foreignID+" resi =>"+resi+" Average =>"+avg);
	}	
}
