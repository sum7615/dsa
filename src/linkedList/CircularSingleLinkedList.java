package linkedList;

public class CircularSingleLinkedList {
	public Node head = null;
	public Node tail = null;
	public int size;

	public void createCircularLinkedList(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = node;
		head = node;
		tail = node;
		size++;
	}

	public void insert(int nodeValue, int index) {
		Node temp = new Node();
		temp.value = nodeValue;
		if (head == null) {
			createCircularLinkedList(nodeValue);
		} else if (index == 0) {
			temp.next = head;
			head = temp;
			tail.next = head;
		} else if (index >= size - 1) {
			tail.next = temp;
			tail = temp;
			temp.next = head;
		} else {
			Node prevNode = head;
			for (int i = 0; i < index - 1; i++) {
				prevNode = prevNode.next;
			}
			temp.next = prevNode.next;
			prevNode.next = temp;
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
			System.out.println("Size : " + size);
		} else {
			System.out.println("Circular LinkedList has not initiatted");
		}
	}

	public int search(int nodeValue) {
		Node tempNode = head;
		for (int i = 0; i < size; i++) {
			if (tempNode.value == nodeValue) {
				System.out.println(nodeValue + " Found at index of " + i);
				return i;
			}
			tempNode = tempNode.next;
		}
		System.out.println("Not found");
		return -1;
	}

	public void delete(int nodeValue) {
		int index = search(nodeValue);
		if (size != 0) {
			if (index == 0) {
				head = head.next;
				tail.next = head;
				size--;
				if (size == 0) {
					tail = null;
					head.next = null;
					head = null;
				}
			} else if (index >= size - 1) {
				Node tempNode = head;
				for (int i = 0; i < size - 1; i++) {
					tempNode = tempNode.next;
				}
				if (tempNode == head) {
					tail = null;
					head.next = null;
					head = null;
					size--;
					return;
				}
				tempNode.next = head;
				tail = tempNode;
				size--;
			} else {
				Node tempNode = head;
				for (int i = 0; i < index - 1; i++) {
					tempNode = tempNode.next;
				}
				tempNode.next = tempNode.next.next;
				size--;
			}

		} else {
			System.out.println("Circular linkedList have not initiallised");
		}
	}
	public void deleteEntireCircularLinkedList() {
		if(head!=null) {
			tail=null;
			head.next=null;
			head=null;
			size=0;
		}else {
			System.out.println("Circular LinkedList has not initialised");
		}
		
	}
}
