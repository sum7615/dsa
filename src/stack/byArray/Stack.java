package stack.byArray;

public class Stack {
	int topOfStack;
	int[] arr;

	public Stack(int size) {
		arr = new int[size];
		topOfStack = -1;
	}

	public boolean isFull() {
		if (topOfStack == arr.length - 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (topOfStack == -1) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int value) {
		if (isFull()) {
			System.out.println("Stack is full");
		} else {
			arr[topOfStack+1] = value;
			topOfStack++;
		}

	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		} else {
			int res = arr[topOfStack];
			topOfStack--;
			return res;
		}

	}
	public int peek() {
		if(isEmpty()) {
			System.out.println("The stack is empty");
			return -1;
		}else {
			return arr[topOfStack];
		}
	}
	public void deleteStack() {
		topOfStack=-1;
	}

}
