package linkedList.question;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
//		SinglyLinkedList sll = new SinglyLinkedList();
//		
//		
//		sll.create(3);
//		sll.insert(5);
//		sll.insert(8);
//		sll.insert(5);
//		sll.insert(10);
//		sll.insert(2);
//		sll.insert(1);
//		sll.traversal();
//		deleteDuplicate(sll);
//		deleteDuplicateOptimised(sll);
//		System.out.println(nthValueFromLastNode(sll,2)); 
//		sll.traversal();
//
//		SinglyLinkedList ll = partition(sll, 5);
//		ll.traversal();

		SinglyLinkedList sll = new SinglyLinkedList();
		SinglyLinkedList sll1 = new SinglyLinkedList();
		
		
		sll.create(3);
		sll.insert(5);
		sll.insert(8);
		
		sll1.create(10);
		sll1.insert(2);
		sll1.insert(1);
		sll1.traversal();
		
		
		
	}
//	Delete Duplicate entries

//	O(N^2)
	public static void deleteDuplicate(SinglyLinkedList sll) {
		Node temp = sll.head;
		while (temp != null) {
			Node secondNode = temp;
			while (secondNode.next != null) {
				if (secondNode.next.value == temp.value) {
					secondNode.next = secondNode.next.next;
					sll.size--;
				} else {
					secondNode = secondNode.next;
				}
			}
			temp = temp.next;
		}
	}

//	Time: O(N), Space:O(N)
	public static void deleteDuplicateOptimised(SinglyLinkedList sll) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node temp = sll.head;
		Node prev = null;
		while (temp != null) {
			if (set.contains(temp.value) && prev != null) {
				prev.next = temp.next;
				sll.size--;
			} else {
				set.add(temp.value);
				prev = temp;
			}
			temp = temp.next;
		}
	}

	public static int nthValueFromLastNode(SinglyLinkedList sll, int n) {
		Node node = sll.head;
		for (int i = 0; i < sll.size - n - 1; i++) {
			if (i > sll.size) {
				return -1;
			}
			node = node.next;
		}
		return node.value;

	}
//Partition of linkedlist time: O(N)
	public static SinglyLinkedList partition(SinglyLinkedList sll, int n) {
		Node node = sll.head;
		for (int i = 0; i < sll.size; i++) {
			if (node.value >= n) {
				Node next  = node.next;
				sll.tail.next = node;
				sll.tail = node;
				sll.tail.next = null;
				node = next;

			} else {
					if(i==0) {
						node=node.next;
					}else {
						Node next  = node.next;
			            node.next=sll.head;
			            sll.head = node;
			            node =next;
					}
					
			}
		}
		return sll;
	}

}
