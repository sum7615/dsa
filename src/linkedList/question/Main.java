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
	  Node node =sll.head;
	  while(node!=null) {
		  Node runner = node.next;
		  Node prevRunner = node;
		  if(runner.value==runner.value) {
			  prevRunner.next=
		  }
		  
		  node=node.next;
	  }
	}

	
	
	
	
	
	
	
	
}
