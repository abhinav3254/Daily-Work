package genrics;

public class TypeSafetyDemo {
	Object object;
	
	public TypeSafetyDemo (Object object) {
		this.object = object;
	}
	
	public Object getObject() {
		return object;
	}
}