package com.paran.selfstudy;

public class GenericArithmetic{
	   public static <T extends Number> T add(T x, T y) {
		   Number result = null;
		   if ( x.getClass() == Integer.class ) {
			   result = (Integer)x+(Integer)y;
		   } else if ( x.getClass() == Double.class ) {
			   result = (Double)x+(Double)y;
		   }
		   return (T)result;
	   }
	   public static <T extends Number> Number subtract(T x, T y) {
   		   Number result = null;
		   if ( x.getClass() == Integer.class ) {
			   result = (Integer)x-(Integer)y;
		   } else if ( x.getClass() == Double.class ) {
			   result = (Double)x-(Double)y;
		   }
		   return result;
	   }
	   public static <T extends Number> T multiply(T x, T y) {
   		   Number result = null;
		   if ( x.getClass() == Integer.class ) {
			   result = (Integer)x*(Integer)y;
		   } else if ( x.getClass() == Double.class ) {
			   result = (Double)x*(Double)y;
		   }
		   return (T)result;
	   }
	   public static <T extends Number> T divide(T x, T y) {
   		   Number result = null;
		   if ( x.getClass() == Integer.class ) {
			   result = (Integer)x/(Integer)y;
		   } else if ( x.getClass() == Double.class ) {
			   result = (Double)x/(Double)y;
		   }
		   return (T)result;
	   }
	   
	   public static void main(String[] args) {
//		   System.out.println(add(1,2));
//		   System.out.println(add(1.1,2.2));
//		   System.out.println(subtract(3,1));
//		   System.out.println(subtract(3.1,1.1));
		   
	   }
}

class Banana {
	public void showInfo() {
		System.out.println("I`m banana");
	}
}

class FruitBox<T> {
	private T item;
	public FruitBox(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	public void showInfo() {
		if( item instanceof Banana ) {
			((Banana)item).showInfo();
		}
	}
}