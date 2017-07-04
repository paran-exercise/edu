package com.paran.chapter13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;

public class ClassInfo {
	static ArrayList<Student> stuList = new ArrayList<Student>();
	
	final static int NAME_LEN = 12;
	final static int STUID_LEN = 23;
	final static int RESIID_LEN = 37;
	final static int RESI_LEN = 42;
	
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("c:/dev/asd.txt"));
		
		for(int i=0; i<8; i++){
			String line = br.readLine();
			if((line.substring(RESIID_LEN+1, RESI_LEN)).equals("¿Ü±¹ÀÎ"))
				stuList.add(new ForeStudent(line.substring(STUID_LEN, RESIID_LEN)));
			else
				stuList.add(new DomeStudent(line.substring(STUID_LEN, RESIID_LEN)));
		}
		
		br.close();
		br = new BufferedReader(new FileReader("c:/dev/asd.txt"));
		
		for(int i=0; i<8; i++){		
			String line = br.readLine();
            (stuList.get(i)).setName(line.substring(0, NAME_LEN));
            (stuList.get(i)).setStuID(line.substring(NAME_LEN, STUID_LEN));
            (stuList.get(i)).setStuID(line.substring(RESIID_LEN));
            
		}
		br.close();
		
		
		
		for(int i=0; i<8; i++){
			(stuList.get(i)).showInfo();
		}
	}
}

//=======================abstract==============================
abstract class Student{
	String name;
	String stuID;
	int engScore;
	int korScore;
	int proScore;
	
	public void setName(String name){
		this.name = name;
	}
	public void setStuID(String stuID){
		this.stuID = stuID;
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
		System.out.println("name =>"+name+" stuID =>"+stuID+" resiID =>"+resiID);
	}	
}

class ForeStudent extends Student{
	String foreignID;
	
	public ForeStudent(String ID){
		foreignID = ID;
	}
	public void showInfo(){
		System.out.println("name =>"+name+" stuID =>"+stuID+" foreignID =>"+foreignID);
	}	
}
