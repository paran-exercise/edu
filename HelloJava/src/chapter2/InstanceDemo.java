package chapter2;

public class InstanceDemo {	
	public static void main(String[] args){
		String msg="Hello";
		int asd = '1';
		Printer ssPrinter = new Printer("삼성", true);
		Printer hpPrinter = new Printer("HP", false);
		Printer epsonPrinter = new Printer("Epson", false);
		
		ssPrinter.print(msg);
		hpPrinter.print(msg);
		epsonPrinter.print(msg);
		
		ssPrinter.a=12;
		System.out.println(Printer.a);
		System.out.println(hpPrinter.a);
		System.out.println(true);
	}	
}

class Printer{
	String manufacture;
	boolean isColorPrinter;
	static int a = 123;

	public Printer(String manufacture, boolean isColorPrinter){ 
		this.manufacture = manufacture;
		this.isColorPrinter = isColorPrinter;
	}

	public void print(int msg){
		if(isColorPrinter){
			System.out.println(manufacture+" color print : "+msg);
		}
		else{
			System.out.println(manufacture+" mono print : "+msg);
		}
	}
	public void print(String msg){
		if(isColorPrinter){
			System.out.println(manufacture+" color print : "+msg);
		}
		else{
			System.out.println(manufacture+" mono print : "+msg);
		}
	}
	
	public static void printA(String msg, boolean isColor){
		System.out.println(msg);
	}
}
