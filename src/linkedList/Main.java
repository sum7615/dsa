package linkedList;

public class Main {
	public static void main(String[] args) {
		
//		Single LinkedList
		
		SingleLinkedList sll = new SingleLinkedList();
		sll.createSinglyLinkedList(1);
		sll.insertIntoSingleLinkedList(0, 8);
		sll.insertIntoSingleLinkedList(0, 7);
		sll.insertIntoSingleLinkedList(0, 6);
		sll.insertIntoSingleLinkedList(0, 5);
		sll.insertIntoSingleLinkedList(0, 4);
		sll.insertIntoSingleLinkedList(0, 2);
//		System.out.println(sll.head.value);
//		System.out.println(sll.head.next.value);
//		sll.treaversal();
//		sll.search(11);
//		sll.deleteNode(5);
//		sll.treaversal();
//		sll.deleteEntireLinkedList();
//		sll.treaversal();
//	sll.insertRec(1, 78);
//		sll.treaversal();
//		Circular Single LinkedList
//		CircularSingleLinkedList csll = new CircularSingleLinkedList();
//		csll.createCircularLinkedList(1);
//		csll.insert(4, 0);
//		csll.insert(5, 2);
//		csll.insert(6, 3);
//		csll.insert(7, 4);
//		csll.traversal();
//		csll.search(7);
//		csll.delete(6);
//		csll.deleteEntireCircularLinkedList();
//		csll.traversal();
		
		sll.treaversal();
		LeetCode leetCode = new LeetCode();
		leetCode.revMedium(sll.head, 4, 6);
		sll.treaversal();
		
		
		
	}

}
