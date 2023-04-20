package linkedList;

public class LeetCode {
	public void revMedium(Node head, int left, int right) {
		Node prevOfLeft=null;
		Node leftNode=null;
		Node rightNode=null;
		Node nextOfRight=null;
		Node centre=null;
		Node temp=null;
		int c=0;
		while(head!=null) {
			if(head.value==left && head.next.next.value==right) {
				if(c!=0) {
					prevOfLeft= temp;
				}
				leftNode=head;
				centre=leftNode.next;
				rightNode=centre.next;
				nextOfRight=rightNode.next;
			}
			c++;
			if(c!=0) {
				temp=head;
			}
			
			head=head.next;
		}
		if(prevOfLeft==null){
			head=rightNode;
			centre.next=leftNode;
			leftNode.next =nextOfRight;
			
		}else {
			centre.next=leftNode;
			leftNode.next =nextOfRight;
			prevOfLeft.next=rightNode;
			rightNode.next = centre;
		}

		
	}

}
