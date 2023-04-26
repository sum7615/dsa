package queue.byArray;

import queue.byArray.circular.CircularQueue;

public class Main {
	public static void main(String[] args) {
		Queue qu = new Queue(4);
		
		qu.enQueue(5);
		qu.enQueue(6);
		qu.enQueue(7);
		qu.enQueue(8);
//
//		qu.deQueue();
//		qu.deQueue();
//		qu.deQueue();
		
		System.out.println(qu.peek());
		
		System.out.println(qu.toString());  
	}
	
}
