package linkedList;

public class Main {
	public static void main(String[] args) {
		
		
//		SingleLinkedList sll = new SingleLinkedList();
//		sll.createSinglyLinkedList(1);
//		sll.insertIntoSingleLinkedList(1, 8);
//		sll.insertIntoSingleLinkedList(2, 9);
//		sll.insertIntoSingleLinkedList(3, 6);
//		sll.insertIntoSingleLinkedList(4, 5);
//		sll.insertIntoSingleLinkedList(5, 4);
//		sll.insertIntoSingleLinkedList(6, 2);
//
//		
//		sll.treaversal();
	
//		System.out.println();
		
//		leetCode.revMedium(sll, 8, 6);
		
//		leetCode.swapPos(sll, 3, 4).treaversal();;
		
		
//		System.out.println(leetCode.romanToDecimal("III"));

		
//		sll.treaversal();

		LeetCode leetCode = new LeetCode();
		SingleLinkedList sll = new SingleLinkedList();
		SingleLinkedList sll2 = new SingleLinkedList();
		sll.createSinglyLinkedList(1);
		sll.insertIntoSingleLinkedList(1, 2);
		sll.insertIntoSingleLinkedList(2, 4);
		
		sll2.createSinglyLinkedList(1);
		sll2.insertIntoSingleLinkedList(4, 3);
		sll2.insertIntoSingleLinkedList(5, 4);
		Node kk = leetCode.mergeTwoLists(sll.head, sll2.head);
		
		while(kk.next!=null) {
			System.out.println(kk.value+"=>");
		}
		
	}

}
