class Three {
	public static void main (String[] args) {
		countLength("name is abhinav");
	}
	
	public static void countLength (String name) {
		int count = 0;
		
		for (int i = 0;i<name.length();i++) {
			count++;
		}
		
		System.out.println(count);
}
	} 