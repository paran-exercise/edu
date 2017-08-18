package com.paran.chapter21;

public class FirstGenericDemo {
	public static void main(String[] args) {
		// type argument
		Inventory<String> inst1 = new Inventory<String>("아이템1");
		Inventory<Item> inst2 = new Inventory<Item>(new Item());
		
		showInvenItemA(inst1);
	}
	// type argument가 뭐든 pass
	public static void showInvenItemA(Inventory<?> inven) {
		inven.showInfo();
	}
	// type argument가 Item is-a relation, Item을 시작으로 하위를 받을 수 있음
	public static void showInvenItemB(Inventory<? extends Item> inven) {
		inven.showInfo();
	}
	// Item을 시작으로 상위를 받을 수 있음.
	public static void showInvenItemC(Inventory<? super Item> inven) {
		inven.showInfo();
	}
	public static void showInvenItemD(Inventory<Item> inven) {
		inven.showInfo();
	}
}

class Item {
	String name;
	String id;
	String originalOwner;
}

class SubItem extends Item {
	String name;
	String id;
	String originalOwner;
}

class Inventory <T> {
	public  T item;
	public Inventory(T item) {
		this.item = item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	public void showInfo() {
		System.out.println(item);
	}
}