package stack.byLinkedList.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> q;
	int top;

	public MyStack() {
		q = new LinkedList<>();
	}

	public void push(int x) {
		q.add(x);
		top=x;
	}

	public int pop() {
		  int size = q.size();
	        while (size > 2) {
	            q.offer(q.poll());
	            size--;
	        }
	        top = q.peek();
	        q.offer(q.poll());
	        return q.poll();
	}

	public int top() {
		return this.top;
	}

	public boolean empty() {
		return top==0;
	}
}
