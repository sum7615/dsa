package linkedList.question;

public class SinglyLinkedList {
	public int size;
	public Node head;
	public Node tail;

	public void create(int nodeValue) {
		Node node = new Node();
		node.value = nodeValue;
		node.next = null;
		head = node;
		tail = node;
		size++;
	}

	public void insert(int nodeValue) {
		if (head == null) {
			create(nodeValue);
			return;
		}
		Node node = new Node();
		node.value = nodeValue;
		tail.next = node;
		node.next = null;
		tail = node;
		size++;
	}

	public void traversal() {
		Node temp = head;
		for (int i = 0; i < size; i++) {
			System.out.print(temp.value);
			temp = temp.next;
			if(i<size-1) {
				System.out.print("->");
			}
		}
		System.out.println();
	}
	public int search(int nodeValue) {
		if(head!=null) {
			Node node =head;
			for(int i=0;i<size;i++) {
				if(node.value==nodeValue) {
					System.out.println(nodeValue+" found at index of: "+i);
					return i;
				}
			}
			System.out.println("Not found");
			return -1;
		}else {
			System.out.println("Not initialized");
			return -1;
		}
	}
	public void delete(int nodeValue) {
		if(head!=null) {
			int index = search(nodeValue);
			if(index!=-1) {
				if(index==0) {
					head=head.next;
					size--;
					if(size==0) {
						head=null;
						tail=null;
						return;
					}
				}else if(index>=size) {
					Node node = head;
					for(int i=0;i<size-1;i++) {
						node=node.next;
					}
					node.next=null;
					tail=node;
					size--;
					if(size==0) {
						head=null;
					}
				}else {
					Node node = head;
					for(int i=0;i<index-1;i++) {
						node=node.next;
					}
					node.next=node.next.next;
					size--;
				}
				
			}else {
				return;
			}
		}else {
			System.out.println("Not initialized");
		}
	}
		
}
