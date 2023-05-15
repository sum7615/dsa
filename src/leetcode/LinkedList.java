package leetcode;

public class LinkedList {
	int size;
	ListNode head, tail;

	public void createLL(int value) {
		head = new ListNode();
		head.value = value;
		head.next = null;
		tail = head;
		size++;

	}

	public void insertValue(int value) {
		if (head == null) {
			createLL(value);
		} else {
			ListNode node = new ListNode();
			node.value = value;
			node.next = null;
			tail.next = node;
			tail = node;
			size++;
		}
	}

	public void traverse() {

		if (head == null) {
			System.out.println("LinkedList empty.");
		} else {
			ListNode temp=head;
			while (temp != null) {
				
				System.out.print(temp.value);
				if (temp.next != null)
					System.out.print("->");
				temp = temp.next;

			}
		}
	}

}
