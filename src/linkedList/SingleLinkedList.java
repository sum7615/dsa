package linkedList;

public class SingleLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size++;
		return head;
	}

	public void insertIntoSingleLinkedList(int index, int nodeValue) {
		Node newNode = new Node();
		newNode.value = nodeValue;
		if (index == 0) {
			newNode.next = head;
			head = newNode;
		} else if (index >= size) {
			newNode.next = null;
			tail.next=newNode;
			tail=newNode;
		}else {
			Node prevNode = new Node();
			for(int i=0; i<index-1;i++) {
				prevNode = prevNode.next;
			}
			Node nextNode = prevNode.next;
			prevNode.next=newNode;
			newNode.next=nextNode;
			
		}
		size++;

	}
	
	
	public void treaversal() {
		if(size<=0 || head.next==null) {
			System.out.println("LinkedList have not initialized");
		}else {
			Node temp = head;
			if(temp.next!=null) {
			for(int i=0;i<size;i++) {
				System.out.print(temp.value+"=>");
				temp=temp.next;
			}
			}
		}
		
		System.out.println();
//		System.out.println("Size: "+size);
	}
	public int search(int nodeValue) {
		if(head==null) {
			System.out.println("Not initialized");
			return -1;
		}
		if(head.value==nodeValue) {
			System.out.println(nodeValue+" Found at index of 0");
			return 0;
		}else if(tail.value==nodeValue) {
			System.out.println(nodeValue+" Found at index of "+(size-1));
			return size-1;
		}else {
			Node temp =head.next;
			for(int i=1;i<size-1;i++) {
				if(temp.value==nodeValue) {
					System.out.println(nodeValue+" Found at index of "+i);
					return i;
				}
				temp=temp.next;
			}
			System.out.println("Not found");
			return -1;
		}
	}
	public void deleteNode(int nodeValue) {
		int index = search(nodeValue);
		if(index!=-1) {
			if(index==0) {
				Node temp =head;
				head=head.next;
				temp.next=null;
				size--;
				if(size==0) {
					tail=null;
				}
				System.out.println("Done");
			}else if(index >= size-1) {
				Node temp = head;
				for(int i=0;i<size-1;i++) {
					temp=temp.next;
				}
				tail=temp;
				size--;
				if(size==0) {
					head=null;
				}
			}else {
				Node temp = head;
				for(int i=0;i<index-1;i++) {
					temp=temp.next;
				}
				temp.next=temp.next.next;
				size--;
			}
		}else {
			return;
		}
	}
	public void deleteEntireLinkedList() {
		head=null;
		tail=null;
		size=0;
		System.out.println("Whole LikedList deleted");
	}
	public void insertRec(int index,int nodeValue) {
		
		insertRec(index,nodeValue,head,head);
	}
	public Node insertRec(int index,int nodeValue, Node node,Node prev) {
		if(index==0) {
			Node newNode = new Node();
	        newNode.value = nodeValue;
	        if (node == head) {
	            newNode.next = head;
	            head = newNode;
	        } else if (node == null) {
	            tail.next = newNode;
	            tail = newNode;
	            newNode.next=null;
	        } else {
	            newNode.next = node;
	            prev.next = newNode;

	        }
	        size++;
	        return node;
	
		}
			return insertRec(index-1,nodeValue,node.next,node);
	}
	
	
}
