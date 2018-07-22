package com.akash.threading;



public class DaemonThreadExample {
	private static class Daemon implements Runnable{
		@Override
		public void run() {
		System.out.println("Run-"+Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		System.out.println("Is daemon:"+Thread.currentThread().isDaemon());
		}}
	
	
	public static void main(String[] args) {
		Thread t = new Thread(new Daemon(),"Daemon");
		Thread t1 = new Thread(new Daemon(),"User");
		t.setDaemon(true);
		t.start();t1.start();
		
	}
}
