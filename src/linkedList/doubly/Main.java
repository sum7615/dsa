package linkedList.doubly;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
//		dll.create(1);
//		System.out.println(dll.head.value);
//		dll.insert(0, 0);
//		dll.insert(4, 1);
//		dll.insert(5, 2);
//		dll.insert(6, 3);
//		dll.insert(7, 4);
//		dll.insert(8, 5);
//		dll.traversal();
//		dll.reverseTraversal();
//		dll.search(4);
//		dll.delete(8);
//		dll.traversal();
//		dll.deleteEntireLinkedList();
//		dll.traversal();
		
		
		
//		Circular Doubly LinkedList
		
		CircularDoublyLinkedList cdll=new CircularDoublyLinkedList();
		cdll.create(1);
		cdll.insert(2, 6);
		cdll.insert(3, 1);
		cdll.insert(4, 2);
		cdll.insert(5, 3);
		cdll.insert(6, 4);
		cdll.insert(7, 5);
		cdll.insert(8, 7);
		cdll.insert(9, 8);
		cdll.traversal();
		cdll.search(9);
		cdll.search(98);
		
		cdll.traversal();
		cdll.delete(1);
		cdll.traversal();
		cdll.delete(9);
		cdll.traversal();
		cdll.delete(7);
		cdll.traversal();
		

	}

}
