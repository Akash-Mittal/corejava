package com.practise.threading;

//Write a program which have two threads printing odd and even alternately in sequence
//

public class MainClient {
	static String myLocker = new String("");
	static boolean didIRan = false;
	static volatile int counter = 1;

	public static void main(String[] args) throws InterruptedException {

		Thread oddMainThread = new Thread(new OddThread(10));
		Thread evenMainThread = new Thread(new EvenThread(10));
		evenMainThread.start();
		oddMainThread.start();

	}
}

class EvenThread implements Runnable {
	int printValuesTill;
	String myLocker;

	public EvenThread(int printValuesTill) {
		this.printValuesTill = printValuesTill;

	}

	public void run() {

		for (; MainClient.counter < this.printValuesTill; MainClient.counter++) {
			synchronized (MainClient.myLocker) {
				try {
					if(MainClient.counter%2==0)
						System.out.println("Even:"+MainClient.counter);
					MainClient.myLocker.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				MainClient.myLocker.notifyAll();
			}

		}

	}

}

class OddThread implements Runnable {

	int printValuesTill;

	public OddThread(int printValuesTill) {
		this.printValuesTill = printValuesTill;

	}

	public void run() {

		for (; MainClient.counter < this.printValuesTill; MainClient.counter ++) {

			synchronized (MainClient.myLocker) {
				if(MainClient.counter%2==1)
					System.out.println("Odd:"+MainClient.counter);
				try {
					MainClient.myLocker.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				MainClient.myLocker.notifyAll();
			}
		}

	}

}
