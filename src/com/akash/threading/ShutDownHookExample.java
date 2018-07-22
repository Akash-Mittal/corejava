package com.akash.threading;



public class ShutDownHookExample implements Runnable{
@Override
public void run() {
System.err.println(Thread.currentThread().getName()+":"+"Shutdown task Completed");
System.err.println(Thread.currentThread().getName()+":Daemon or Nor:"+Thread.currentThread().isDaemon());
System.err.println(Thread.currentThread().getName()+":Priority:"+Thread.currentThread().getPriority());
}
public static void main(String[] args) throws InterruptedException {
	Runtime runtime = Runtime.getRuntime();
	runtime.addShutdownHook(new Thread(new ShutDownHookExample()));
	System.out.println("Sleeping press control c");
	//Thread.sleep(1000000);
	System.exit(1);
}
}
