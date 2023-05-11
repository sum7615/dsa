package queue.byArray;

import java.util.Arrays;

public class CircularQueue {
	int[] arr;
	int size, topOfQueue, beginingOfQueue;

	public CircularQueue(int size) {
		this.arr = new int[size];
		this.size =size;
		topOfQueue=-1;
		beginingOfQueue=-1;
	}
	
	public boolean isEmpty() {
		return topOfQueue==-1 && beginingOfQueue==-1;
	}
	public boolean isFull() {
		return topOfQueue+1==beginingOfQueue || topOfQueue+1==arr.length && beginingOfQueue==0;
	}
	public void enQueue(int value) {
		if(isFull()) {
			System.out.println("Queue is full");
			return ;
		}else {
			if(isEmpty()) {
				topOfQueue++;
				beginingOfQueue=0;
			}else {
				if(topOfQueue+1==size) {
					topOfQueue=0;
				}else {
					topOfQueue++;
				}
				
			}
			arr[topOfQueue]=value;
		}
	}
	
	public int deQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			int res = arr[beginingOfQueue];
			arr[beginingOfQueue]=Integer.MIN_VALUE;
			if(beginingOfQueue+1==size) {
				beginingOfQueue=0;
			}else if(beginingOfQueue == topOfQueue){
				beginingOfQueue=topOfQueue=-1;
			}else {
				beginingOfQueue++;
			}
			
			return res;
		}
	}
	public void printArr() {
		System.out.println(Arrays.toString(arr));
	}
}
