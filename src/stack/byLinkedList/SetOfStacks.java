package stack.byLinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SetOfStacks {
	
	int subSTacksize;
//	private List<Integer> elements = new ArrayList<Integer>();
	private List<StackByArray> listOfStack = new ArrayList<StackByArray>();
	public SetOfStacks(int subSTacksize) {
		
		this.subSTacksize = subSTacksize;
		listOfStack.add(new StackByArray());
	}

	public void push(int value) {
//		elements.add(value);
		if (listOfStack.get(listOfStack.size() - 1).push(value)) {
			System.out.println("Pushed without creating new stack");
		} else {
			listOfStack.add(new StackByArray());
			if (listOfStack.get(listOfStack.size() - 1).push(value)) {
				System.out.println("Pushed by creating new stack");
			}
		}

	}

	public void details() {
		System.out.println();
		System.out.println("=============================================");
//		System.out.println("Elements: " + elements.toString());
		System.out.println("Number of stack: " + listOfStack.size());
		System.out.println();
		System.out.println("=============================================");
		System.out.println("    Stack inside");
		for(StackByArray s:listOfStack) {
			s.print();
			System.out.println();
		}
		
	}

	public int popAt(int index) {
		int el= listOfStack.get(index).pop();
//		elements.remove(el);
		return el;
	}

}
