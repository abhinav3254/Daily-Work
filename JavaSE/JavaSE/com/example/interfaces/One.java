
// package com.example.interfaces;

class One {
	public static void main (String[] args) {
		System.out.println(First.PI);
		FirstImpl fi = new FirstImpl();
		System.out.println("sum method :- "+fi.sum(10,20));
		System.out.println("square method :-"+fi.square(12));
		
		First f = new FirstImpl();
		System.out.println("sum method :- "+f.sum(10,20));
		System.out.println("square method :-"+f.square(12));
		//System.out.println("square method :-"+f.power(12,2));
		
	}
}

interface First {
	double PI = 3.14;
	// internally they are public static final
	public static final int MAX = 10;
	
	int sum (int x,int y);
	public abstract int square (int x);
}

class FirstImpl implements First {
	
	public int square (int x) {
		return x*x;
	}
	
	public int sum (int x,int y) {
		return x+y;
	}
	
	public int power (int x,int n){
		int res = 1;
		for (;n>0;n--)
			res = res * x;
		return res;
	}
}