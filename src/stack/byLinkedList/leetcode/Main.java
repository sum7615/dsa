package stack.byLinkedList.leetcode;

public class Main {
	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(1);
		myQueue.push(2);
		myQueue.push(3);
		myQueue.print();
		System.out.println();
		System.out.println(myQueue.peek());
		System.out.println();
		myQueue.print();
	}

}
