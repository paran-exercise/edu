package com.paran.chapter11;

class AnimalDemo {
	public static void testClassMethod() {
		System.out.println("The static method in Animal");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal");
	}
}

class Cat extends AnimalDemo {
	public static void testClassMethod() {
		System.out.println("The static method in Cat");
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat");
	}
	
	public static void main(String[] args) {
		// Cat 클래스에 인스턴스 생성. mycat 참조 변수로 해당 인스턴스 참조
		Cat myCat = new Cat();
		//묵시적, upcasting 발생
		AnimalDemo myAnimal = myCat;
		// 아래 2개 문장처럼 사용하면 안되지만 이해를 돕기 위해
		myCat.testClassMethod();
		myAnimal.testClassMethod();
		AnimalDemo.testClassMethod();
		myAnimal.testInstanceMethod();
	}
}