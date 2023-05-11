package queueByLinkedList;

public class Queue {
	LinkedList linkedlist = new LinkedList();
	int topOfQueue, beginingOfQueue;

	public Queue() {
		linkedlist.head = null;
		linkedlist.tail = null;
		linkedlist.size = 0;
		topOfQueue = beginingOfQueue = -1;
	}

	public boolean isEmpty() {
		return linkedlist.size == 0;
	}

	public void enQueue(int value) {
		linkedlist.insertAtTail(value);
		topOfQueue = beginingOfQueue = 0;
	}

	public void print() {
		linkedlist.treaversal();
	}

	public int deQueue() {
		if (isEmpty()) {
			return -1;
		} else {
			int res = linkedlist.head.value;
			linkedlist.head = linkedlist.head.next;
			return res;
		}

	}

	public int peek() {
		if (isEmpty()) {
			return -1;
		} else {
			return linkedlist.head.value;
		}

	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("Empty queue");
		} else {
			linkedlist.head = linkedlist.tail = null;
		}
	}

}