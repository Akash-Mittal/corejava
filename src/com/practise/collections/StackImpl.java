package com.practise.collections;

public class StackImpl {
private int top;	
private Object[] objects;
private int size;

public StackImpl(int size) {
	top=-1;
	this.size = size;
	this.objects = new Object[size];
}

private boolean push(Object pushedObject) throws InterruptedException {
if(top>size-2){
	System.out.println("CANNOT PUSH:"+pushedObject +"@TOP["+top+"]:"+"Size["+size+"]");
	return false;}
else{	
	top++;objects[top]=pushedObject;
	System.out.println("PUSHED:"+pushedObject +"@TOP["+top+"]:"+"Size["+size+"]");
}return true;}

private boolean pop() throws InterruptedException {
	if(top<=-1){
		System.out.println("SLEPT COZ CANNOT POP:"+"@TOP["+top+"]:"+"Size["+size+"]");
		//return false;
		Thread.sleep(1000);
	}
	objects[top]=null;top--;
	System.out.println("POPPED:"+objects[top] +"@TOP["+top+"]:"+"Size["+size+"]");
	Thread.sleep(2000);
	return true;
}
private void peek() {
	for(int i=0;i<size;i++)
		System.out.print(objects[i]+",");
}
public static void main(String[] args) throws InterruptedException  {
		final StackImpl stackImpl = new StackImpl(100);
		new Thread("push"){public void run() {
			for(int i=0;i<100;i++)
				try {
					stackImpl.push(i);
					notify();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		};}.start();
		
		new Thread("pop"){public void run() {
			try {
				while(true)
				stackImpl.pop();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		};}.start();

		//stackImpl.peek();
			
}
}
