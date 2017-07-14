package com.paran.project2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class GradeInfo {
	private static ArrayList<Student> students = new ArrayList<Student>();
	private static ArrayList<String> classNames = new ArrayList<String>();
	private static int stuNum;
	public static void main(String[] args) throws IOException{
		stuNum = readStuInfo(args[0]);
		rank();
		showStuInfo();
	}
	static int readStuInfo(String path) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line;				
		int i = 0;
		
		while((line = reader.readLine()) != null){
			String[] splitedLine = line.split("_");
			if(splitedLine.length % 2 == 0){
				students.add(new Student(splitedLine[0], splitedLine[1]));
				classNames.add(splitedLine[1]);
				for(int j=3; j<=splitedLine.length; j+=2){
					students.get(i).setScores(splitedLine[j-1], splitedLine[j]);
				}
				i++;
			}else{
				students.add(new Student(splitedLine[0], splitedLine[1], splitedLine[2]));
				classNames.add(splitedLine[1]);
				for(int j=4; j<=splitedLine.length; j+=2){
					students.get(i).setScores(splitedLine[j-1], splitedLine[j]);
				}
				i++;
			}
		}
		classNames = new ArrayList<String>(new HashSet<String>(classNames)); 
		reader.close();
		return i;
	}
	static void rank(){
		for(int i = 0; i < stuNum; i++){
			students.get(i).average();
		}
		sort(students, students.size());
		for(int i = 0; i < stuNum; i++){  
			students.get(i).overallRank = i+1;
		}		
		for(String className : classNames){
			ArrayList<Student> members = new ArrayList<Student>();
			for(int i = 0; i < stuNum; i++){
				if(students.get(i).getStuClass().equals(className)){
					members.add(students.get(i));
				}
			}
			sort(members, members.size());
			for(int i = 0; i < members.size(); i++){  
				members.get(i).classRank = i+1;
			}
		}		
	}
	static void sort(ArrayList<Student> stuList, int size){ //bubble
		Student s;
		for(int i = 0; i < size; i++){
			for(int j = 1; j < size-i; j++){
				if(stuList.get(j).stuAvg > stuList.get(j-1).stuAvg){
					s = stuList.get(j);
					stuList.remove(j);
					stuList.add(j, stuList.get(j-1));
					stuList.remove(j-1);
					stuList.add(j-1, s);
				}
			}
		}
	}
	static void showStuInfo(){
		for(int i = 0; i<stuNum; i++){
			System.out.print(String.format("Name => %s\tClass => %s\t%s", students.get(i).getStuName(), students.get(i).getStuClass(),
					(students.get(i).getStuMajor() != null)?String.format("Major => %s\t", students.get(i).getStuMajor()):""));
			for(int j = 0; j<students.get(i).subNum; j++){
				System.out.print(String.format("%s => %s\t", students.get(i).getGrade(j)[0], students.get(i).getGrade(j)[1]));
			}
			System.out.print(String.format("Average => %.2f\tClass ranking => %d\tOverall ranking => %d", students.get(i).stuAvg, students.get(i).classRank, students.get(i).overallRank)); //!!!!
			System.out.println();
		}
	}	
}
class Student{
	private String stuName;
	private String stuClass;
	private String stuMajor = null;
	private ArrayList<String> subjects = new ArrayList<String>();
	private ArrayList<String> scores = new ArrayList<String>();
	int subNum = 0;
	float stuAvg;
	int classRank = 0;
	int overallRank = 0;
	public Student(String stuName, String stuClass){
		this.stuName = stuName;
		this.stuClass = stuClass;		
	}
	public Student(String stuName, String stuClass, String stuMajor){
		this.stuName = stuName;
		this.stuClass = stuClass;	
		this.stuMajor = stuMajor;
	}
	public void setScores(String subject, String score){
		subjects.add(subject);
		scores.add(score);		
		subNum++;
	}
	public String getStuName(){
		return stuName;
	}
	public String getStuClass(){
		return stuClass;
	}
	public String getStuMajor(){
		return stuMajor;
	}
	public String[] getGrade(int i){
		return new String[]{subjects.get(i), scores.get(i)};
	}
	public float average(){
		float sum = 0;
		for(int i=0; i<subNum; i++){
			sum+=Float.parseFloat(scores.get(i));
		}
		return stuAvg = sum/subNum;
	}
}
/*
Robert_A_Network_English_100_Korean_60_Programming_72
Kim_A_Network_English_93_Korean_89_Programming_75
Jacob_B_Mathematics_English_51_Korean_75_Mathematics_96
Jang_B_Mathematics_English_55_Korean_95_Mathematics_76
Matthew_B_Mathematics_English_61_Korean_100_Programming_86
Akira_C_Aesthetic_English_94_Japanese_45_Aesthetics_85
Masao_C_Aesthetic_English_74_Japanese_85_Aesthetics_90
Minoru_C_Aesthetic_English_24_Japanese_42_Aesthetics_98
Mohnke_D_Philosophy_English_84_German_95_Philosophy_55
Hermann_D_Philosophy_English_70_German_80_Philosophy_97
Adolf_D_Philosophy_English_54_German_92_Philosophy_40
*/
