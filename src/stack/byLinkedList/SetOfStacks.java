package stack.byLinkedList;

import java.util.ArrayList;
import java.util.List;

public class SetOfStacks {
	int subSTacksize;
	private List<Integer> elements = new ArrayList<Integer>();
	private List<StackByArray> listOfStack = new ArrayList<StackByArray>();

	public SetOfStacks(int subSTacksize) {
		this.subSTacksize = subSTacksize;
		listOfStack.add(new StackByArray());
	}

	public void push(int value) {
		elements.add(value);
		if (listOfStack.get(listOfStack.size() - 1).push(value)) {
			System.out.println("Pushed without creating new stack");
//			return;
		} else {
			listOfStack.add(new StackByArray());
			if (listOfStack.get(listOfStack.size() - 1).push(value)) {
				System.out.println("Pushed by creating new stack");
			}
		}

	}

	public void details() {
		System.out.println("Elements: " + elements.toString());
		System.out.println("Number of stack: " + listOfStack.size());
		System.out.println("Stack inside");
	}

	public int popAt(int index) {
		return -1;
	}

}
