package linkedList.question;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.create(1);
		sll.insert(2);
		sll.insert(3);
		sll.insert(4);
		sll.insert(2);
		sll.insert(5);
		sll.insert(3);
		sll.traversal();
		deleteDuplicate(sll);
		sll.traversal();

	}
//	Delete Duplicate entries

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

}
