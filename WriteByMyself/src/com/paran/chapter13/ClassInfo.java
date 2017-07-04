package com.paran.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class ClassInfo {
	static ArrayList<Student> stuList = new ArrayList<Student>();

	public static void main(String[] args)throws IOException{
		int lineCount = setStuList();		
		
		for(int i=0; i<lineCount; i++){
			(stuList.get(i)).showInfo();
		}
	}
	
	public static int setStuList()throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("C:/dev/workspace/suffering.txt"));
		int i=0;
		String line;
		String[] splitLine = new String[10];
		
		for(i=0; (line = br.readLine()) != null; i++){
			splitLine = line.split("_");
			
			if(splitLine[3].equals("Foreiner")){
				stuList.add(new ForeStudent(splitLine[2]));
			}else{
				stuList.add(new DomeStudent(splitLine[2]));
			}
			
			stuList.get(i).setName(splitLine[0]);
            stuList.get(i).setStuID(splitLine[1]);
            stuList.get(i).avgScore(splitLine[4], splitLine[5], splitLine[6]);
            stuList.get(i).resi = splitLine[3];            
		}
		Collections.sort(stuList);
		br.close();
		return i; 
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
	public void avgScore(String engScore, String korScore, String proScore){
		this.engScore = Integer.parseInt(engScore);
		this.korScore = Integer.parseInt(korScore);
		this.proScore = Integer.parseInt(proScore);
		avg = (this.engScore+this.korScore+this.proScore)/3; 
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
		System.out.print("name =>"+name+"\tstuID =>"+stuID+"\tresiID =>"+resiID+"\t"+resi);
		System.out.println("\tEnglish =>"+engScore+"\tKorean =>"+korScore+"\tProgramming =>"+proScore+"\tAverage =>"+avg);
	}	
}

class ForeStudent extends Student{
	String foreignID;
	
	public ForeStudent(String ID){
		foreignID = ID;
	}
	public void showInfo(){
		System.out.print("name =>"+name+"\tstuID =>"+stuID+"\tforeignID =>"+foreignID+"\t"+resi);
		System.out.println("\tEnglish =>"+engScore+"\tKorean =>"+korScore+"\tProgramming =>"+proScore+"\tAverage =>"+avg);
	}	
}

/*
 * suffering.txt
Jacob_13-76087320_940-519-098_Foreigner_12_34_56
Kim_12-76877320_940519-0987654_Resident_78_90_11
Robert_17-76077328_190-987-654_Foreigner_21_41_51
Kong_11-96877820_951112-0987654_Resident_90_78_48
Mcmuffin_18-76078320_695-947-224_Foreigner_28_49_23
Pain_19-76077380_960-219-098_Foreigner_90_26_71 
*/ 
