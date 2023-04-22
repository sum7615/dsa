package queue.byArray;

public class Queue {
	public int arr[];
	public int topOfQueue;
	public int beginingofQueue;
	public Queue(int size) {
		this.arr= new int[size];
		this.topOfQueue=-1;
		this.beginingofQueue=-1;
	}
	public boolean isFull() {
		if(topOfQueue==arr.length-1) {
			return true;
		}else {
			return false;
		}
	}
	public boolean isEmpty() {
		if(topOfQueue==-1) {
			return true;
		}else {
			return false;
		}
	}
	
	
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
		}else if(isEmpty()) {
			topOfQueue++;
			beginingofQueue=0;
			arr[topOfQueue]=value;
			System.out.println("Added");
			return;
		}else {
			topOfQueue++;
			arr[topOfQueue]=value;
			System.out.println("Added");
			return;
		}
	}
}
