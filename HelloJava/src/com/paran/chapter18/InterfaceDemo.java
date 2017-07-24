package com.paran.chapter18;

interface Animal { 
	abstract public void eat();
	abstract public void travel();
}

interface Walkable {
	abstract public void walk();
}

class Mammal implements Animal, Walkable {
	
	@Override
	public void eat() {
		System.out.println("Mammal Eat method");
	}
	
	@Override
	public void travel() {
		System.out.println("Mammal Travel method");
	}
	
	@Override
	public void walk() {
		System.out.println("Mammal Walk method");
	}
}

class Amphibian implements Animal, Walkable {
	
	@Override
	public void eat() {
		System.out.println("Amphibian Eat method");
	}
	
	@Override
	public void travel() {
		System.out.println("Amphibian Travel method");
	}
	
	@Override
	public void walk() {
		System.out.println("Amphibian Walk method");
	}
}

public class InterfaceDemo {
	public static void main(String[] args) {
		Animal obj1 = new Mammal();
		Animal obj2 = new Amphibian();
		Walkable obj3 = (Walkable)obj1;
		
		obj1.eat();
		obj1.travel();
		obj2.eat();
		
	}
}
