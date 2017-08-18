package com.paran.chapter21;

import java.util.ArrayList;
import java.util.List;

public class SecondGenericDemo {
	public static void main(String[] args) {
		List<?> ref = new ArrayList<Seed>();
		ref.add();
//		Plants refPlants;
//		Fruit<Seed> refFruit;
//		Fruit<SeedSeed> refFruit2;
//		Apple<Seed, String> refApple = new Apple<>(new Seed(), "1234");
//		Mango<Seed> refMango;
////		refFruit = refApple;
////		refFruit2 = refApple;
////		refPlants = refFruit;
////		refPlants = refApple;
//		refPlants = refApple;
//		refFruit = refApple;
		
		
	}
}

interface Plants {
	public int photosynthesis(int amountOfCo2);
}

class Fruit<T> implements Plants {
	public T seedType;
	@Override
	public int photosynthesis(int amountOfCo2) {
		//TODO Auto-generated method stub
		return amountOfCo2;
	}
}

class Apple<T extends Seed, S> extends Fruit<T> {
	public S var;
	public Apple(T seedType) {
		this.seedType = seedType;
	}
	public Apple(T seedType, S var) {
		this.seedType = seedType;
		this.var = var;
	}
}

class Mango<T extends Seed> extends Fruit<T> {
	public Mango(T seedType) {
		this.seedType = seedType;
	}
}

class Seed {
}
class SeedSeed {
}