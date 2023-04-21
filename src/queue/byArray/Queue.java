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

}
