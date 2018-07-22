package com.akash.threading;

public class SimpleExample  {

	static void printMesage(String string){
		System.out.println(Thread.currentThread().getName()+" Says .."+string);
	}
	public static class Loop implements Runnable{
	@Override
	public void run() {
		try {
			String importantInfo[] = {
		            "Mares eat oats",
		            "Does eat oats",
		            "Little lambs eat ivy",
		            "A kid will eat ivy too"
		        };

			for(int i=0;i<importantInfo.length;i++)
			{
				printMesage(importantInfo[i]);	
				Thread.sleep(2000);
			}
			} catch (InterruptedException e) {
				printMesage("I am interupted");
				e.printStackTrace();
			}}}
	public static void main(String[] args) throws InterruptedException {
		long patience = 1000 * 5;
		printMesage("Started new thread");
	Thread thread  = new Thread(new Loop(),"MyThread");
	
	System.out.println("----getThreadGroup----"+thread.getThreadGroup());
	Long startTime =	System.currentTimeMillis();
	thread.start();
	printMesage("Waiting to finish");
	while (thread.isAlive()) {
		 thread.join(500);
		if(System.currentTimeMillis()-startTime>patience&&thread.isAlive()){
			printMesage("interrupting man cant wait for more than 5 sec");
			thread.interrupt();
			thread.join();
		}
	}
	
	}
}