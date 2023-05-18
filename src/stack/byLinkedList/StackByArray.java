package stack.byLinkedList;

public class StackByArray {
	int[] arr;
	int topOfStack;

	public StackByArray() {
		arr = new int[3];
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

	public boolean push(int value) {
		if (isFull()) {
			return false;
		} else {
			arr[topOfStack + 1] = value;
			topOfStack++;
			return true;
		}

	}

	public void print() {
		for(int i:arr) {
			System.out.print(i+" ");
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
}
