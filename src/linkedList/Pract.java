package linkedList;

public class Pract {
	public Node head;
	public Node tail;
	public int size;

	public Node insertSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	public void push(int nodeValue) {
		if (head == null) {
			insertSinglyLinkedList(nodeValue);
			return;
		} else {
			Node node = new Node();
			node.value = nodeValue;
			node.next = null;
			tail.next = node;
			tail = node;
			size++;
		}

	}

	// Insert

	public void traversal() {
		if (head == null) {
			System.out.println("No node");
			return;
		}
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.value);
			temp = temp.next;
			if (i < size - 1) {
				System.out.print("->");
			}
		}
		System.out.println();
	}

	public boolean insert(int data, int index) {
		if (index < 0 || index > size) {
			System.out.println("Invalid index");
			return false;
		}
		Node node = new Node();
		node.value = data;

		if (head == null) {
			System.out.println("creating the first node");
			node.next = null;
			head = node;
			tail = node;
			size = 1;
			return true;
		} else if (index == 0) {
			System.out.println("Inserting at head");
			node.next = head;
			head = node;
			size++;
			return true;
		} else if (index >= size) {
			System.out.println("inserting at tail");
			tail.next = node;
			tail = node;
			size++;
			return true;
		} else {
			System.out.println("inserting at "+index);
			System.out.println("head : "+head.value);
			Node prev = head;
			for (int i = 1; i < index-1; i++) {
				prev = prev.next;
				System.out.println(prev.value);
			}
			node.next = prev.next;
			prev.next = node;
			size++;
			return true;
		}

	}

	public static void main(String[] args) {
		Pract pre = new Pract();
		pre.push(5);
		pre.push(10);
		pre.push(15);
		pre.push(20);
		pre.traversal();

		pre.insert(12, 2);

		pre.traversal();

	}
}
