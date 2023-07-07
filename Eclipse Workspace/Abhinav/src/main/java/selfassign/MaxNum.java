package selfassign;

import java.io.*;

public class MaxNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of n ");
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		System.out.println("MAX VALUE IS :- "+findMax(arr));
	}
	
	public static int findMax (int[] arr) {
		int MAX = Integer.MIN_VALUE;
		for (int i = 0;i<arr.length;i++) {
			if (arr[i]>MAX) {
				MAX = arr[i];
			}
		}
		
		return MAX;
	}
}
