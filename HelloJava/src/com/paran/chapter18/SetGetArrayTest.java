package com.paran.chapter18;

// 


class Dataarray{
	
	private String name; 
	private int num;
	private int code;
	private double weight;
	
	Dataarray(String name,int num,int code,double weight)
	{
	
	this.name = name; 
	this.num = num;
	this.code = code;
	this.weight = weight;
	}
 
	public String getName(){
	return name;
	}
	
	public String setName(){
	this.name = name;
	return name;
	}
	
	public int getNum(){  //  getName(){  	
	return num;				// return 변수이름; 
	}						// }
	
	public int setNum(int num) {  // setName(type VariableName)  { 
		this.num = num;			// this.varialbeName = varialbeName  
	return num;
	}							// { 
	
	public int getcode(){
	return code;
	}
	public int setCode(int code) {
		this.code = code; 
	return code;
	}	
	public double getWeight() {
		return weight;
	}
		
	public double setWeight(double weight) {
		this.weight = weight;
	return weight;
	}
}
	public class SetGetArrayTest {	
	   public static void main(String[] args) {
	        
	       int sumnum = 0;
	       int sumcode = 0;
	       double sumweight = 0;
	 double[] test1 = new double[3];
	 Dataarray[] data1 = new Dataarray[3]; 
	 // 배열선언 후에  배열리스트 값할당 주 
	 // variable[] = new typeName(value1",vaule2....);   
	 data1[0] = new Dataarray("김명수",20,33,174.8);
	 data1[1] = new Dataarray("나도물라",22,83,2274.8);
	 data1[2] = new Dataarray("진짜몰라",23,93,3374.8);
	 
	 int leng = data1.length;
	 
     
	 for (int i=0;i<leng;i++){
		 
		 sumnum +=data1[0].getNum();
		 sumcode +=data1[0].getcode();
		 sumweight +=data1[0].getWeight();
	 }
	 
	 for (int j=0; j<leng;j++){
		 String n = data1[j].getName();
		 int aa = data1[j].getNum();
		 int bb = data1[j].getcode();
		 double cc = data1[j].getWeight();
	 
	 
	 System.out.println("이름:"+n+"");
	 System.out.println("num:"+aa+"");
	 System.out.println("code:"+bb+"");
	 }

//     
	 
 }
	
}