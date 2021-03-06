package com.practise.threading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecuterServiceExample {
	static synchronized void printMessage(String message){
		System.out.println(Thread.currentThread().getName()+":"+message);
	}
	public static class printer implements Runnable{
		public printer() {
			printMessage("started");
		}
		@Override
		public void run() {
			printMessage("sleeping");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				printMessage("Error..");
				e.printStackTrace();
			}
			printMessage("exiting");	
		}
	}
public static void main(String[] args) {
ExecutorService executor = Executors.newFixedThreadPool(5);
executor.execute(new printer());

executor.execute(new printer());
executor.execute(new printer());
executor.shutdown();

}
}


/*
  java.util.concurrent.ExecutorService


An Executor that provides methods to manage termination and methods that can produce a 
Future for tracking progress of one or more asynchronous tasks. 

An ExecutorService can be shut down, which will cause it to reject new tasks. 
Two different methods are provided for shutting down an ExecutorService. 
The shutdown method will allow previously submitted tasks to execute before terminating, while the shutdownNow method prevents waiting tasks from starting and attempts to stop currently executing tasks. Upon termination, an executor has no tasks actively executing, no tasks awaiting execution, and no new tasks can be submitted. An unused ExecutorService should be shut down to allow reclamation of its resources. 

Method submit extends base method Executor.execute by creating and returning a Future that can be used to cancel execution and/or wait for completion. Methods invokeAny and invokeAll perform the most commonly useful forms of bulk execution, executing a collection of tasks and then waiting for at least one, or all, to complete. (Class ExecutorCompletionService can be used to write customized variants of these methods.) 

The Executors class provides factory methods for the executor services provided in this package. 

Usage Examples
Here is a sketch of a network service in which threads in a thread pool service incoming requests. It uses the preconfigured Executors.newFixedThreadPool factory method: 
 class NetworkService implements Runnable {
   private final ServerSocket serverSocket;
   private final ExecutorService pool;

   public NetworkService(int port, int poolSize)
       throws IOException {
     serverSocket = new ServerSocket(port);
     pool = Executors.newFixedThreadPool(poolSize);
   }

   public void run() { // run the service
     try {
       for (;;) {
         pool.execute(new Handler(serverSocket.accept()));
       }
     } catch (IOException ex) {
       pool.shutdown();
     }
   }
 }

 class Handler implements Runnable {
   private final Socket socket;
   Handler(Socket socket) { this.socket = socket; }
   public void run() {
     // read and service request on socket
   }
 }
 
The following method shuts down an ExecutorService in two phases, first by calling shutdown to reject incoming tasks, and then calling shutdownNow, if necessary, to cancel any lingering tasks: 
 void shutdownAndAwaitTermination(ExecutorService pool) {
   pool.shutdown(); // Disable new tasks from being submitted
   try {
     // Wait a while for existing tasks to terminate
     if (!pool.awaitTermination(60, TimeUnit.SECONDS)) {
       pool.shutdownNow(); // Cancel currently executing tasks
       // Wait a while for tasks to respond to being cancelled
       if (!pool.awaitTermination(60, TimeUnit.SECONDS))
           System.err.println("Pool did not terminate");
     }
   } catch (InterruptedException ie) {
     // (Re-)Cancel if current thread also interrupted
     pool.shutdownNow();
     // Preserve interrupt status
     Thread.currentThread().interrupt();
   }
 }
 
Memory consistency effects: Actions in a thread prior to the submission of a Runnable or Callable task to an ExecutorService happen-before any actions taken by that task, which in turn happen-before the result is retrieved via Future.get().

Since:
1.5
Author:
Doug Lea

*/
