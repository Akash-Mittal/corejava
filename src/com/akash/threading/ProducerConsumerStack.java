package com.akash.threading;

public class ProducerConsumerStack {
private static Integer top=0;
private static int defaultSize = 10;
private static  Object[] objects = new Object[defaultSize];

private static void display(){
	for(int i=0;i<objects.length;i++)
	System.out.println(objects[i]);
	}
private static class Push implements Runnable{
	private Object pushobject;
	public Push(Object object) {
		this.pushobject=object;
	}
	@Override
	public void run() {
			if(top+1>defaultSize)
				return;
				synchronized (top) {
					System.out.println("PUSHED:"+pushobject +"@TOP["+top+"]:"+"Size["+defaultSize+"]");
					objects[top++]=this.pushobject;	
	}}}
public static void main(String[] args) throws InterruptedException {
	new Thread(new Push(10)).start();
	new Thread(new Push(11)).start();
	new Thread(new Push(12)).start();
	new Thread(new Push(13)).start();
	Thread.sleep(1000);
	display();
}	

}
