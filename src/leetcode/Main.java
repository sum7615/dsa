package leetcode;



public class Main {
	public static void main(String[] args) {
		LinkedList link1 = new LinkedList();
		LinkedList link2 = new LinkedList();
//		-9,3
		link1.createLL(-9);
		link1.insertValue(3);
//		link1.insertValue(4);
//		link2.insertValue(1);
//		link2.insertValue(3);
		link2.insertValue(5);
		link2.insertValue(7);
	
		
		
		MergeTwoSortedList ms = new MergeTwoSortedList();
		ListNode res= ms.mergeTwoLists(link1.head, link2.head);
		while(res!=null) {
			System.out.print(res.value);
			if(res.next!=null)
			System.out.print("->");
			res=res.next;
		}

	}
}
