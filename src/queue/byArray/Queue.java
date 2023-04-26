package queue.byArray;

import java.util.Arrays;

public class Queue {
	public int arr[];
	public int topOfQueue;
	public int beginingofQueue;

	public Queue(int size) {
		this.arr = new int[size];
		this.topOfQueue = -1;
		this.beginingofQueue = -1;
	}

	public boolean isFull() {
		return topOfQueue == arr.length - 1;
	}

	public boolean isEmpty() {
		return topOfQueue == -1;
	}

	public void enQueue(int value) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (isEmpty()) {
				System.out.println("Entering into empty queue");
				beginingofQueue = 0;
			}
			topOfQueue += 1;
			arr[topOfQueue] = value;
			System.out.println("Added");
		}
	}

	public int deQueue() {
		if (isEmpty()) {
			System.out.println("No value");
			return -1;
		} else {
			int res = arr[beginingofQueue];
			arr[beginingofQueue] = Integer.MIN_VALUE;
			if (beginingofQueue == topOfQueue) {
				beginingofQueue = -1;
				topOfQueue = -1;
			} else {
				beginingofQueue++;
			}
			return res;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("No Value");
			return -1;
		} else {
			return arr[beginingofQueue];
		}
	}

	public void delete() {
		if (isEmpty()) {
			System.out.println("The queue is empty");
		} else {
			arr = null;
		}
	}

	@Override
	public String toString() {
		topOfQueue = -1;
		beginingofQueue = -1;
		return Arrays.toString(arr);
	}
}
