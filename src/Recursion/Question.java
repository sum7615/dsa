package Recursion;

public class Question {
	public static void main(String[] args) {
System.out.println(power(2,3));
	}
	public static int power(int base, int exception) {
		if(exception==0) {
			return 1;
		}
		return base*power(base,exception-1);
		
	}
}
