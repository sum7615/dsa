package Recursion;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Main m = new Main();
//		System.out.println(m.countDown(7));
//		System.out.println(m.power(2, 4));
		LinkedList<Integer> link = new LinkedList<Integer> ();
		link.add(1);
		link.add(5);
		link.add(2);
		link.add(3);
		link.add(4);
		System.out.println(m.reverseLinkedList(link));
		
	}
	public int countDown(int n) {
		if (n == 0) {
			return 0;
		}
		int num = (int) Math.pow(10, n);
		return num*n + countDown(n - 1);
	}
	
	public int power(int a, int b) {
		
		if(b==0) {
			return 1;
		}
		return a*power(a,b-1);
	}
	
	public LinkedList<Integer> reverseLinkedList(LinkedList<Integer> link){
		LinkedList<Integer> reverse = new LinkedList<>();
		
		
		reverse.add(link.getLast());
		
		
		return reverse;
	}
	
	
}
