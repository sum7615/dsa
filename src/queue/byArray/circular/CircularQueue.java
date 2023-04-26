package queue.byArray.circular;

import java.util.Arrays;

public class CircularQueue {
	int size;
	int arr[];
	int topOfQueue;
	int beginingOfQueue;

	public CircularQueue(int size) {
		this.size = size;
		this.arr = new int[size];
		topOfQueue = -1;
		beginingOfQueue = -1;
	}

//isEmpty
	public boolean isEmpty() {
		if (topOfQueue == -1) {
			return true;
		} else {
			return false;
		}
	}

//	isFull
	public boolean isFull() {
		if (beginingOfQueue == 0 && topOfQueue == size - 1) {
			return true;
		} else if (topOfQueue + 1 == beginingOfQueue) {
			return true;
		} else {
			return false;
		}
	}
//	enqueue

	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
			return;
		} else {

			if (isEmpty()) {
				beginingOfQueue = 0;
				topOfQueue++;
			} else {
				if (topOfQueue + 1 == size) {
					topOfQueue = 0;
				} else {
					topOfQueue++;
				}
				
			}
			arr[topOfQueue] = value;
		}

	}

//	deQueue
	public int deQueue() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
			return -1;
		} else {
			int res = arr[beginingOfQueue];
			arr[beginingOfQueue] = Integer.MIN_VALUE;
			if (beginingOfQueue == topOfQueue) {
				beginingOfQueue = topOfQueue = -1;
			} else if (beginingOfQueue + 1 == size) {
				beginingOfQueue = 0;
			} else {
				beginingOfQueue++;
			}
			return res;
		}
	}

//	peek
	public int peek() {
		if (isEmpty()) {
			System.out.println("The queue is e4mpty");
			return -1;
		} else {
			return arr[beginingOfQueue];
		}
	}

	// Delete the queue
	public void delete() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
		} else {
			arr = null;
		}
	}

	@Override
	public String toString() {
		System.out.println(Arrays.toString(arr));
		return super.toString();
	}

}
