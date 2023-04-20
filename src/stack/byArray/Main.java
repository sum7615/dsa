package stack.byArray;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(4);
		System.out.println("Is Empty? "+stack.isEmpty());
		System.out.println("Is Full? "+stack.isFull());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		System.out.println("Is Empty? "+stack.isEmpty());
		System.out.println("Is Full? "+stack.isFull());
		System.out.println("Last item "+stack.peek());
		System.out.println("Deleted item : "+stack.pop());
		System.out.println("Last item "+stack.peek());
	}
}
