package linkedList.question;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.create(1);
		sll.insert(2);
		sll.insert(3);
		sll.insert(4);
//		sll.insert(2);
//		sll.insert(5);
//		sll.insert(3);
		sll.traversal();
//		deleteDuplicate(sll);
//		deleteDuplicateOptimised(sll);
		System.out.println(nthValueFromLastNode(sll,2)); 
//		sll.traversal();

	}
//	Delete Duplicate entries

//	O(N^2)
	public static void deleteDuplicate(SinglyLinkedList sll) {
		Node temp =sll.head;
		while(temp!=null) {
			Node secondNode = temp;
			while(secondNode.next!=null) {
				if(secondNode.next.value==temp.value) {
					secondNode.next=secondNode.next.next;
					sll.size--;
				}else {
					secondNode=secondNode.next;
				}
			}
			temp=temp.next;
		}
	}
//	Time: O(N), Space:O(N)
	public static void deleteDuplicateOptimised(SinglyLinkedList sll) {
		HashSet<Integer> set = new HashSet<Integer>();
		Node temp = sll.head;
		Node prev =null;
		while(temp!=null) {
			if(set.contains(temp.value)&&prev!=null) {
				prev.next=temp.next;
				sll.size--;
			}else {
				set.add(temp.value);
				prev=temp;
			}
			temp=temp.next;
		}
	}
	
	public static int nthValueFromLastNode(SinglyLinkedList sll,int n) {
		Node node = sll.head;
		for(int i=0;i<sll.size-n-1;i++) {
			node=node.next;
		}
		return node.value;
		
	}

}
