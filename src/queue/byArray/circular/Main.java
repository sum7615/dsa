package queue.byArray.circular;

public class Main {
	public static void main(String[] args) {
		CircularQueue cq = new CircularQueue(4);
		cq.enQueue(5);
		cq.enQueue(6);
		cq.enQueue(7);
		cq.enQueue(8);
		cq.deQueue();
		cq.deQueue();
		cq.deQueue();
		cq.enQueue(3);
		cq.enQueue(4);
		cq.deQueue();
		cq.deQueue();
		System.out.println(cq.peek());
//		cq.delete();
		cq.toString();  
	}

}
