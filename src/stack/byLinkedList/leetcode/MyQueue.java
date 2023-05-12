package stack.byLinkedList.leetcode;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stack;

	public MyQueue() {
		stack = new Stack<>();
	}

	public void push(int x) {
		stack.push(x);
	}

	public int pop() {
		int top = stack.pop();
	    int result;
	    if (stack.isEmpty()) {
	        result = top;
	    } else {
	        result = pop();
	        stack.push(top);
	    }
	    return result;
	}

	public int peek() {
		int top = stack.pop();
	    int result;
	    if (stack.isEmpty()) {
	        result = top;
	        stack.push(top);
	    } else {
	        result = peek();
	        stack.push(top);
	    }
	    return result;
	}

	public boolean empty() {
		return stack.isEmpty();
	}
	
	
	public void print() {
		for(int i : stack) {
			System.out.print(i);
			if(i<stack.size()) {
				System.out.print("-");
			}
		}
	}
}
