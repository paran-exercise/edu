package com.paran.chapter20;

interface Animal{
	public void eat();
	public void travel(); //abstract가 빠져있다. 무조건 public 한정자끼리는 순서 바뀌어도 됨  
}
interface Walkable{
	public void walk();
	
}
class Mammal implements Animal, Walkable{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammal eat method");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammal travel method");
	}	
	public void walk(){
		System.out.println("Mammal walk method");
	}
}
class Amphibian implements Animal{
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian eat method");
	}
	
	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Amphibian travel method");
	}	
}

public class InterfaceDemo {
	
	public static void main(String[] args){
		Animal obj1 = new Mammal();
		Animal obj2 = new Amphibian();
		Walkable obj3 =(Walkable)obj1;//interface끼리 casting이됨
		obj1.eat();
		obj2.eat();
		obj3.walk();
		
		
		obj1.travel();
		obj2.travel();
	
	}
}
