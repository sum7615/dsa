package leetcode;

public class MergeTwoSortedList {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode head1 = list1;
		ListNode head2 = list2;

		ListNode dummy = new ListNode(0);
		ListNode current = dummy;

		while (head1 != null && head2 != null) {
			if (head1.value < head2.value) {
				current.next = head1;
				head1 = head1.next;
			} else {
				current.next = head2;
				head2 = head2.next;
			}
			current = current.next;
		}

		if (head1 != null) {
			current.next = head1;
		} else {
			current.next = head2;
		}

		return dummy.next;

	}

}
