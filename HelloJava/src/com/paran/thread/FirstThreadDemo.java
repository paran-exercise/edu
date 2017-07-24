package com.paran.thread;

public class FirstThreadDemo extends Thread {
	String name;
	public FirstThreadDemo(String name) {
		this.name = name;
	}
	public void run() {
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " t = > " + i);
		}
	}
	
	public static void main(String[] args) {
		FirstThreadDemo f = new FirstThreadDemo("t1");
		f.start();
		System.out.println("main ends");
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main i = > " + i);
		}
	}
}
