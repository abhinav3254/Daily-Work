class A {
int x = 10;
}

class B extends A {
int x = 20;
public void showB()  {
System.out.println("parent x :- " +super.x);
System.out.println("child x :- " +x);
}
}

class Test {
public static void main (String[] args) {
B b1 = new B ();
b1.showB();
}
}