package Recursion;

public class Question {
	public static void main(String[] args) {
//		System.out.println(power(2, 3));
		System.out.println(factorial(4));
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
}
