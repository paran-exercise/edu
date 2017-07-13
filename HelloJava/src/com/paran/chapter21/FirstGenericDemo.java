package com.paran.chapter21;

public class FirstGenericDemo {
	
	public static void main(String[] args){
		
		Inventory<String> inst1 = new Inventory<String>("아이템1");//<String> Type Argument / 인스턴스 생성시 인자에 대한 정의가 필요함 /T 자리에 String으로 치환됨 
		//Object type또는 상속관계에있는것을 사용할수있음
		
		Inventory<Item> inst2 = new Inventory<Item>(new Item()); //<Item>으로 type argument가 변경되어 item인스턴스 생성해서 넘겨줘야함
		Inventory<?> inst3 = new Inventory<String>("abc"); //<Item>으로 type argument가 변경되어 item인스턴스 생성해서 넘겨줘야함
		Inventory<Object> inst4 = new Inventory<Object>(new Object());
		Inventory<Item> inst5 = new Inventory<Item>(new SubItem());//item의 하위로 자식클래스를 넣어줄수있음
		Inventory<SubItem> inst6 = new Inventory<SubItem>(new SubItem());//item의 하위로 자식클래스를 넣어줄수있음
				
		Inventory<Item> it;
		Inventory<SubItem> it2;//it와 it2는 is-a relation이 안됨
		
		inst2.item.id="123456";
		
		showInvenItemA(inst3);
		showInvenItemA(inst1);
		showInvenItemA(inst2);
		showInvenItemA(inst4);
		
		showInvenItemB(inst1);
		showInvenItemB(inst2);
		showInvenItemB(inst3);
		showInvenItemB(inst4);
		showInvenItemB(inst5);
		
		showInvenItemC(inst1);
		showInvenItemC(inst2);
		showInvenItemC(inst3);
		showInvenItemC(inst4);
		showInvenItemC(inst5);
		
		showInvenItemD(inst1);
		showInvenItemD(inst2);
		showInvenItemD(inst3);
		
		showInvenItemD(inst5);
		
		
	}
	//메소드 생성시 넘겨야하는 parameter를 정확히 선언해주어야함
	public static void showInvenItemA(Inventory<?> inven){//<?> : type argument가 뭐든지 사용가능 
		inven.showInfo();
	}
	public static void showInvenItemB(Inventory<? extends Item> inven){//<? extends ClassName> : item클래스와 is-A 관계면은 함수 호출 가능 부모클래스와 자식클래스 가능 / Upper bound
		inven.showInfo();
	}
	public static void showInvenItemC(Inventory<? super Item> inven){//<? super ClassName> : item클래스와 super클래스(Object클래스) 관계면은 함수 호출 가능 Lower bounded 
		inven.showInfo();
	}
	public static void showInvenItemD(Inventory<Item> inven){//<ClassName> : item의 하위 클래스들도 가능함 
		inven.showInfo();
	}
		
}
class Item{
	String name;
	String id;
	String originalOwner;
	
}
class SubItem extends Item{
	String length;
}
class Inventory<T>{ //<T> type파라미터
	public T item;
	
	public Inventory(T item){
		this.item = item;
	}
	
	public void setItem(T item){
		this.item = item;
	}
	public T getItem(){
		return item;
	}
	public void showInfo(){
		System.out.println(item);
	}
}
