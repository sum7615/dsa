package linkedList.doubly;

public class CircularDoublyLinkedList {
	public Node head;
	public Node tail;
	int size;

	public void create(int nodeValue) {
		Node node = new Node();
		node.previous = node;
		node.next = node;
		node.value = nodeValue;
		head = tail= node;
		size=1;

	}

	public void insert(int nodeValue, int index) {
		Node node = new Node();
		node.value=nodeValue;
		if(size==0) {
			create(nodeValue);
			return;
		}else if(index==0) {
			node.previous=tail;
			node.next=head;
			node.previous = node;
			node.next = node;
			head=node;
		}else if(index>=size) {
			tail.next=node;
			node.next=head;
			node.previous=tail;
			node.previous = node;
			node.next = node;
			tail=node;
		}else {
			Node temp =head;
			for(int i=0; i<index-1;i++) {
				temp=temp.next;
			}
			node.previous=temp;
			node.next=temp.next;
			node.next.previous=node;
			temp.next=node;
		}
		size++;
	}
	public int search(int nodeValue) {
		if(size!=0) {
			Node node=head;
			for(int i=0; i<size;i++) {
				if(node.value==nodeValue) {
					System.out.println(nodeValue+" found in index of "+i);
					return i;
				}
				node=node.next;
			}
			System.out.println("Not exist");
			return -1;
		}else {
			System.out.println("Not initialized");
			return -1;
		}
	}
	public void traversal() {
		if(size!=0) {
			Node temp=head;
			for(int i=0;i<size;i++) {
				System.out.print(temp.value);
				temp=temp.next;
			}
			System.out.println();
		}else {
			System.out.println("Not initialised");
		}
	}
	public void delete(int nodeValue) {
		if(size!=0) {
			int index= search(nodeValue);
			if(index==0) {
				head=head.next;
				head.previous=tail;
				
				size--;
				if(size==0) {
					head=null;
					tail=null;
				}
			}else if(index>=size-1) {
				if(size==1) {
					head=null;
					tail=null;
					size--;
					return;
				}
				tail=tail.previous;
				tail.previous.next=head;
				tail.previous=tail.previous.previous;
				size--;
				
			}else {
				Node temp =head;
				for(int i =0; i<index-1;i++) {
					temp = temp.next;
				}
				temp.next=temp.next.next;
				temp.next.previous=temp;
				size--;
			}
		}else {
			System.out.println("Not initilised");
		}
	}
	public void deleteEntireCircularLinedList() {
		Node temp =head;
		for(int i=0;i<size;i++) {
			temp.previous=null;
			temp=temp.next;
		}
		tail =head= null;
		size=0;
	}
	
}
