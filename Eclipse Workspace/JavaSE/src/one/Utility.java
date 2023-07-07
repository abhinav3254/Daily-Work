package one;

public class Utility {
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int k = -20;
		System.out.println(findElement(arr, k));
	}
	
	public static boolean findElement (int[] arr, int k) {
		boolean ans = false;
		for (int i = 0;i<arr.length;i++) {
			if (k == arr[i]) {
				ans = true;
				break;
			}
		}
		return ans;
	}
	
	public boolean isEven (int n) {
		return n%2==0;
	}
}
