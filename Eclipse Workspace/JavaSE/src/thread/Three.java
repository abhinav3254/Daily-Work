package thread;

// Threads are async by default proof

public class Three {
	public static void main(String[] args) {
		Printer printer = new Printer();
		ChildThread ct1 = new ChildThread(printer, new String[] {"Hello","Welcome","Bye Bye"});
		ChildThread ct2 = new ChildThread(printer, new String[] {"Apple","Orange","Banana"});
		ChildThread ct3 = new ChildThread(printer, new String[] {"Java","Node.js","Angular"});
		
		try {
			ct1.t.join();
			ct2.t.join();
			ct3.t.join();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		System.out.println("Main is Going to be Terminated");
	}
	
	static class ChildThread implements Runnable {

		Thread t;
		Printer p;
		String[] messages;
		public ChildThread(Printer p,String[] messages) {
			// TODO Auto-generated constructor stub
			t = new Thread(this);
			this.p = p;
			this.messages = messages;
			t.start();
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			p.print(messages);
		}
		
	}
	
	
	static class Printer {
		// sync
		synchronized public void print(String[] messages) {
			for (String m:messages)
				System.out.print(m+"  ");
			System.out.println();
		}
		
		// async method anything will be printed randomly
		public void print1(String[] messages) {
			for (String m:messages)
				System.out.print(m+"  ");
			System.out.println();
		}
	}
}
