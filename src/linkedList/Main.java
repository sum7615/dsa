package linkedList;

public class Main {
	public static void main(String[] args) {
		
		
		SingleLinkedList sll = new SingleLinkedList();
		LeetCode leetCode = new LeetCode();
		sll.createSinglyLinkedList(1);
		sll.insertIntoSingleLinkedList(1, 8);
		sll.insertIntoSingleLinkedList(2, 9);
		sll.insertIntoSingleLinkedList(3, 6);
		sll.insertIntoSingleLinkedList(4, 5);
		sll.insertIntoSingleLinkedList(5, 4);
		sll.insertIntoSingleLinkedList(6, 2);

		
		sll.treaversal();
	
		System.out.println();
		
//		leetCode.revMedium(sll, 8, 6);
		
		leetCode.swapPos(sll, 3, 4).treaversal();;

		
//		sll.treaversal();

		
		
		
	}

}
