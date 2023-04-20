package linkedList;



public class Pract {
	public Node head;
	public Node tail;
	public int size;

	public void insertSinglyLinkedList(int nodeValue) {
		
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size = 1;
	}

	public void push(int nodeValue) {
		if (head == null) {
			insertSinglyLinkedList(nodeValue);
		} else {
			Node node = new Node();
			node.value = nodeValue;
			tail.next = node;
			tail = node;
			size++;
			System.out.println("Success");
		}

	}

	public Node pop() {
		
		if (size == 0 ) {
			System.out.println("No node to delete");
			return null;
		} else if (head == tail) {
			Node res1 = head;
			head = null;
			tail = null;
			size--;
			return res1;
		} else {
			
			Node res = tail;
			
			Node prev = head;
			for (int i = 0; i < size-1; i++) {
				prev = prev.next;
			}
			
			prev.next = null;
			tail = prev;
			size=size-1;
			if (size == 0) {
				head = null;
			}
			
			System.out.println("Deleted");
			System.out.println("Size= "+size);
			return res;
		}
	}

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
	public static void main(String[] args) {
		Pract pre = new Pract();
		pre.push(1);
		pre.push(2);
		pre.push(3);
		pre.push(4);
		pre.push(5);
		pre.traversal();
		Node res =pre.pop();
		System.out.println(res.value);

		pre.traversal();

	}
}
