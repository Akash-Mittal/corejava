package com.akash.threading;

public class GarbageCollectionExample {
	@Override
	protected void finalize() throws Throwable {
		System.out.println(Thread.currentThread().getName()+"Recyle Bin");
	}
	
	private static class SomeClass implements Runnable{
		
		@Override
		public void run() {
		System.out.println("Run-"+Thread.currentThread().getName()+":"+Thread.currentThread().getPriority());
		System.out.println("Is daemon:"+Thread.currentThread().isDaemon());
		}}
	
	public static void main(String[] args) {
		GarbageCollectionExample  example = new GarbageCollectionExample();
		example=null;
		System.gc();
	}
	
}
