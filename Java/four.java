class four {
	public static void main (String[] args) {
		Human human = new Human(new Integer(5));
		human.showLegs();
	}
}
class Human<T> {
	T leg;
	
	Human(T leg){
		this.leg = leg;
	} 
	
	public void showLegs() {
		System.out.println("Human has:-"+this.leg);
	}
}