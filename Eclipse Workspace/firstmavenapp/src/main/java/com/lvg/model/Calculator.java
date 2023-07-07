package com.lvg.model;

public class Calculator {
	public int square (int x) {
		return x*x;
	} 
	
	public int sum (int ...x) {
		int s = 0;
		for (int i : x) {
			s = s + i;
		}
		return s;
	}
	
	public int power (int x , int n) {
		int res = 1;
		for (;n>0;n--) {
			res = res * x;
		}
		return res;
	}
}
