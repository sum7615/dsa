package Recursion;

public class Question {
	public static void main(String[] args) {
//		System.out.println(power(2, 3));
//		System.out.println(factorial(4));
//		int[] arr = { 1, 2, 3, 4 };
//		System.out.println(productofArray(arr, arr.length));
//		System.out.println(recursiveRange(4));
//		System.out.println(fib(35));
//		System.out.println(reverse("suman"));
		System.out.println(isPalindrome("sps"));
	}

	public static int power(int base, int exception) {
		if (exception == 0) {
			return 1;
		}
		return base * power(base, exception - 1);
	}

	public static int factorial(int num) {
		if (num == 0) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static int productofArray(int A[], int N) {
		if (N == 0) {
			return 1;
		}
		return A[N - 1] * productofArray(A, N - 1);

	}

	public static int recursiveRange(int num) {
		if (num == 0) {
			return 0;
		}
		return num + recursiveRange(num - 1);
	}

	public static int fib(int n) {
		if (n <= 1) {
			return n;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

	public static boolean isPalindrome(String s) {
		 if(s.length() == 0 || s.length() == 1) {
	           return true; 
		 }
  
         if(s.charAt(0) == s.charAt(s.length()-1)) {
        	 return isPalindrome(s.substring(1, s.length()-1));
         }
        
         return false;
	}

}
