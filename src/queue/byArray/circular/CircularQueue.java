package queue.byArray.circular;

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
		} else if (topOfQueue == beginingOfQueue + 1) {
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
		} else if (isEmpty()) {
			beginingOfQueue=0;
			topOfQueue++;
			arr[topOfQueue]=value;
		} else {
			if(topOfQueue+1==size) {
				topOfQueue=0;
			}else {
				topOfQueue++;
			}
			arr[topOfQueue] = value;
		}

	}
}
