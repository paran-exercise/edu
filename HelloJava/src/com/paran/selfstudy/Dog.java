package com.paran.selfstudy;

public class Dog {
	String name;
	
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		dog1.bark();
		dog1.name = "Bart";
		
		Dog[] myDogs = new Dog[3];
		myDogs[0] = new Dog();
		myDogs[1] = new Dog();
		myDogs[2] = dog1;
		
		myDogs[0].name = "Fred";
		myDogs[1].name = "Marge";
		
		System.out.print("마지막 개의 이름: ");
		System.out.println(myDogs[2].name);
		
		for(Dog d : myDogs ) {
			d.bark();
		}
	}
	
	public void bark() {
		System.out.println(name + "이(가) 왈! 하고 짖습니다.");
	}
	
	public void eat() {	}
	public void chaseCat() {	}
}
