package oops;

public class Inherit2 {
	public static void main (String[] args) {
		B1 b1 = new B1 ();
		b1.showB();
	}
}

class A1 {
int x = 10;
}

class B1 extends A1 {
int x = 20;
public void showB()  {
System.out.println("parent x :- " +super.x);
System.out.println("child x :- " +x);
}
}

