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
		sll.insert(2);
		sll.insert(1);

		sll1.create(8);
		sll1.insert(2);
		sll1.insert(1);
//		sll1.traversal();

//		int kk = numberFormation(sll1);
//		System.out.println(kk);

//		SinglyLinkedList res = sum(sll, sll1);
//		res.traversal();
//		SinglyLinkedList res1 = sumLists(sll, sll1);
//		res1.traversal();


	}
	
//find intersacting node
	
	public static SinglyLinkedList inter(SinglyLinkedList sl, SinglyLinkedList sl1) {
		SinglyLinkedList result = new SinglyLinkedList();
		int sizeDiff = Math.abs(sl.size-sl1.size);
		
		
		
		return result;
	}
	
	
	
//	sum of 2 singly linked list and create another linkedlist by the sum in reverse order TIme Complexity O(N)
	
	public static SinglyLinkedList sum(SinglyLinkedList sl, SinglyLinkedList sl1) {
		int num1 = numberFormation(sl);
		int num2 = numberFormation(sl1);
		int sum = num1 + num2;
		SinglyLinkedList result = new SinglyLinkedList();
		
		while (sum > 0) {
			int n = sum % 10;
			Node node = new Node();
			node.value = n;
			if (result.head == null) {
				result.head = node;
				result.tail = node;
				
			} else {
				node.next = null;
				result.tail.next=node;
				result.tail = node;
			}
			result.size++;
			sum /= 10;
		}
		return result;

	}

	// Number formation in reverse order
	public static int numberFormation(SinglyLinkedList sl) {
		return reverseTraversal(sl.head);
	}
// Generating revrse order linkedlist from a number , 921 => 1->2->9
	public static int reverseTraversal(Node node) {
		if (node == null) {
			
			return 0;
		}
		int num = reverseTraversal(node.next);
		num = (num * 10) + node.value;
		return num;
	}

	
//	sum of 2 singly linked list and create another linkedlist by the sum in reverse order 
//	Optimised way. TIme Complexity O(N)
	
	
	public static SinglyLinkedList sumLists(SinglyLinkedList sl, SinglyLinkedList sl1) {
		SinglyLinkedList result = new SinglyLinkedList();
	
		Node num1= sl.head;
		Node num2 = sl1.head;
		int carry=0;
		while(num1!=null || num2!=null) {
			int sum = carry;
			if(num1!=null) {
				sum+=num1.value;
				num1=num1.next;
			}
			if(num2!=null) {
				sum+=num2.value;
				num2=num2.next;
			}
			
			Node node =new Node();
			node.value=sum%10;
			if (result.head == null) {
				result.head = node;
				result.tail = node;
				result.size++;
				
			} else {
				node.next = null;
				result.tail.next=node;
				result.tail = node;
				result.size++;
			}
			carry=sum/10;
		}
		return result;
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
				Node next = node.next;
				sll.tail.next = node;
				sll.tail = node;
				sll.tail.next = null;
				node = next;

			} else {
				if (i == 0) {
					node = node.next;
				} else {
					Node next = node.next;
					node.next = sll.head;
					sll.head = node;
					node = next;
				}

			}
		}
		return sll;
	}

}
