package genrics;

public class TypeSafetyDemoMain {
	public static void main(String[] args) {
		TypeSafetyDemo typeSafetyDemo = new TypeSafetyDemo(new Integer(10));
		System.out.println(typeSafetyDemo.getObject());
		
		TypeSafetyDemo typeSafetyDemo2 = new TypeSafetyDemo(new String("Welcome"));
		System.out.println(typeSafetyDemo2.getObject());
	}
}
