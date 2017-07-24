package com.paran.thread;

public class ThirdThreadDemo implements Runnable {
	String name;
	public ThirdThreadDemo(String name) {
		this.name = name;
	}
	@Override
	public void run() {
		System.out.println("start");
		// TODO Auto-generated method stub
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + " t = > " + i);
		}
	}
}

class ThirdThreadClassDemo {
	public static void main(String[] args) {
		Thread t = new Thread(new ThirdThreadDemo("t1"));
		t.setName("t3");
		t.setDaemon(true);
		t.start();
		System.out.println("main ends");
	}
}