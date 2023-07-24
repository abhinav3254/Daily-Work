package thread;

public class One {
	public static void main(String[] args) {
//		Thread thread = Thread.currentThread();
//		System.out.println(thread);
//		System.out.println("Thread Name :- "+thread.getName());
//		System.out.println("Thread Priority:- "+thread.getPriority());
//		System.out.println("Thread Group:- "+thread.getThreadGroup());
//		
//		thread.setName("FirstThread");
//		thread.setPriority(8);
//		System.out.println(thread);
//		System.out.println("Thread Name :- "+thread.getName());
//		System.out.println("Thread Priority:- "+thread.getPriority());
//		System.out.println("Thread Group:- "+thread.getThreadGroup());
		
		SecondThread secondThread = new SecondThread();
		for (int i=1;i<=1000;i++)
			System.out.println("First Loop "+i);
		
	}
}

class SecondThread implements Runnable {
	
	Thread thread;
	
	public SecondThread() {
		thread = new Thread(this);
		thread.start();
	}
	
	public void run() {
		for (int i = 1;i<=1000;i++)
			System.out.println("Second Loop :- "+i);
	}
}