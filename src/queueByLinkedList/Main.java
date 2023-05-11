package queueByLinkedList;

public class Main {
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enQueue(1);
		queue.enQueue(2);
		queue.enQueue(3);
		queue.print();
		System.out.println();
		System.out.println(queue.peek());
//		queue.print();
	}
}
