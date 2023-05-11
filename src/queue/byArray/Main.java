package queue.byArray;


public class Main {
	public static void main(String[] args) {
//		Queue qu = new Queue(4);
//		
//		qu.enQueue(5);
//		qu.enQueue(6);
//		qu.enQueue(7);
//		qu.enQueue(8);
////
//		qu.deQueue();
//		qu.deQueue();
//		qu.deQueue();
		
//		System.out.println(qu.peek());
		
//		System.out.println(qu.toString()); 
		CircularQueue cr = new CircularQueue(3);
		cr.enQueue(1);
		cr.enQueue(2);
		cr.enQueue(3);
	
		cr.printArr();
		System.out.println("De queueing");
		cr.deQueue();
		cr.printArr();
		
		System.out.println("isEmpty? "+cr.isEmpty());
		System.out.println("topOfTheQueue: "+cr.topOfQueue);
		System.out.println("Begining Of The Queue: "+cr.beginingOfQueue);
		System.out.println("isfull? "+cr.isFull());
		
		
		System.out.println("Enquing aftre deque");
		cr.enQueue(4);
		cr.printArr();
		
		
		
		
	}
	
}
