package stack.byLinkedList;

public class Stack {
	LinkedList linkedList=new LinkedList();



	public boolean isEmpty() {
		if (linkedList.head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int value) {
		linkedList.insertIntoSingleLinkedList(0, value);
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			int res= linkedList.head.value;
			linkedList.head=linkedList.head.next;
			linkedList.size--;
			return res;
		}
	}
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}else {
			return linkedList.head.value;
		}
		
	}
}
