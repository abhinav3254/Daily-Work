package interfaces;

public class SuperMan extends Man implements Flyer {

	public SuperMan(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Super Man is Flying");
	}
	
	public void printDetails () {
		String msg ="SuperMan Name is :- "+getName()+" and his age is :- "+getAge();
		System.out.println(msg);
	}

}
