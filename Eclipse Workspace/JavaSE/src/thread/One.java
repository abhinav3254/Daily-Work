package thread;

public class One {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		System.out.println("Thread Name :- "+thread.getName());
		
		System.out.println("Thread Priority:- "+thread.getPriority());
		System.out.println("Thread Group:- "+thread.getThreadGroup());
		
	}
}