package linkedList.doubly;

public class DoublyLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public void create(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		node.previous = null;
		head = node;
		tail = node;
		size = 1;
	}

	public void insert(int nodeValue, int index) {
		Node node = new Node();
		node.value = nodeValue;
		if (size == 0) {
			create(nodeValue);
			return;
		} else if (index == 0) {
			node.next = head;
			node.previous = null;
			head.previous = node;
			head = node;
		} else if (index >= size - 1) {
			node.next = null;
			tail.next = node;
			node.previous = tail;
			tail = node;

		} else {
			Node tempNode = head;
			for (int i = 0; i < index - 1; i++) {
				tempNode = tempNode.next;
			}
			node.previous = tempNode;
			node.next = tempNode.next;
			tempNode.next = node;
			node.next.previous = node;
		}
		size++;
	}

	public void traversal() {
		if (size != 0) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.print(tempNode.value);
				tempNode = tempNode.next;
			}
			System.out.println();
		} else {
			System.out.println("Circular LinkedList has not initiatted yet");
		}
	}

	public void reverseTraversal() {
		if (size != 0) {
			Node tempNode = tail;
			for (int i = size - 1; i >= 0; i--) {
				System.out.print(tempNode.value);
				tempNode = tempNode.previous;
			}
			System.out.println();
		} else {
			System.out.println("Circular LinkedList has not initiatted yet");
		}
	}

	public int search(int nodeValue) {
		if (size != 0) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println(nodeValue + " found at iondex of " + i);
					return i;
				}
				tempNode = tempNode.next;
			}
			System.out.println("Not Found");
			return -1;
		} else {
			System.out.println("Not initialized");
			return -1;
		}

	}

	public void delete(int nodeValue) {
		if (size != 0) {
			int index = search(nodeValue);
			if (index != -1) {
				if (index == 0) {
					head = head.next;
					size--;
					if (size == 0) {
						head.next = null;
						tail.previous = null;
						tail = null;
						head = null;
					}
				} else if (index >= size - 1) {
					if(size==1) {
						head.next = null;
						tail.previous = null;
						size--;
						return;
					}
					tail.previous = null;
					size--;
				} else {
					Node temp = head;
					for (int i = 0; i < index-1; i++) {
						temp = temp.next;
					}
					temp.next=temp.next.next;
					temp.next.previous=temp;
					size--;
				}

			} else {
				System.out.println("Value not present in the list");
			}
		} else {
			System.out.println("Not initialized");
		}
	}
	public void deleteEntireLinkedList() {
		Node temp =head;
		for(int i=0;i<size;i++) {
			temp.previous=null;
			temp=temp.next;
		}
		
		tail =head= null;
		size=0;
	}
	

}
