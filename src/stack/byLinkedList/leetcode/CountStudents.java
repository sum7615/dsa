package stack.byLinkedList.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CountStudents {
	public int countStudents(int[] students, int[] sandwiches) {
		Queue<Integer> student = new LinkedList<Integer>();
		Stack<Integer> sand = new Stack<>();
		for(int i=0;i<students.length;i++) {
			student.add(students[i]);
			sand.push(sandwiches[i]);
		}
		int size = 0;
		while(true) {
			if(student.peek()==sand.peek()) {
				size=0;
				student.poll();
				sand.pop();
			}else {
				size++;
				int res = student.poll();
				student.add(res);
				
			}
		if(size==student.size()) {
			break;
		}
		}
		
		return size;
	}
}
