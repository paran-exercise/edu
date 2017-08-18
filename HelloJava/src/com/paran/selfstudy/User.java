package com.paran.selfstudy;

import java.util.ArrayList;
import java.util.List;

public class User{
	public static void main(String[] args){
		
		Inventory inven1 = (Inventory) new Weapon(new ArrayList());
		
		inven1.add("웨폰1");
		inven1.add("웨폰2");
		inven1.add("웨폰3");
		inven1.add("웨폰4");
		inven1.add("웨폰5");
		
		inven1.showInventory();
	}
}

class Inventory<T> {
	private List<T> items;
	
	public Inventory(List<T> items){
		this.items=items;
		if(items instanceof Weapon){
			Weapon weapon = new Weapon(items);
		} else if ( items instanceof Potion ) {
			Potion potion = new Potion(items);
		}
	}
	public void add(T item){
		items.add(item);
	}
	
	public void remove(T o) {
		remove(o);
	}
	public void showInventory(){
		for(T inven : items){
			System.out.println(inven);
		}
	}
}

class Weapon<T> extends Inventory<T>{

	List<T> Weapon  = new ArrayList();
	
	public Weapon(List<T> items) {
		super(items);
		Weapon.add((T) items);
		// TODO Auto-generated constructor stub
	}
	
	public void showInventory(){
		for(T weapon : Weapon){
			System.out.println(weapon);
		}
	}
}

class Potion<T> extends Inventory<T>{
	
	List<T> Potion  = new ArrayList();
	
	public Potion(List<T> items) {
		super(items);
		Potion.add((T) items);
		// TODO Auto-generated constructor stub
	}
	
	public void showInventory(){
		for(T potion : Potion) {
			System.out.println(potion);
		}
	}
}