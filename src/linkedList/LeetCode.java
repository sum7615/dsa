package linkedList;

public class LeetCode {
	public void revMedium(SingleLinkedList sll, int left, int right) {

		Node temp = null;
		Node ii = sll.head;
		if (sll.head.value == left && sll.head.next.next.value == right) {
			Node leftNode = ii;
			Node centre = leftNode.next;
			Node rightNode = ii.next.next;
			Node nextOfRight = rightNode.next;
			sll.head = rightNode;
			rightNode.next = centre;
			centre.next = leftNode;
			leftNode.next = nextOfRight;

		}
		while (ii != null) {
			if (ii.value == left && ii.next.next.value == right && temp != null) {
				Node prevOfLeft = temp;
				Node leftNode = ii;
				Node rightNode = ii.next.next;
				Node nextOfRight = rightNode.next;
				Node centre = leftNode.next;
				centre.next = leftNode;
				leftNode.next = nextOfRight;
				prevOfLeft.next = rightNode;
				rightNode.next = centre;
			}
			temp = ii;
			ii = ii.next;
		}

	}

	public SingleLinkedList swapPos(SingleLinkedList sll, int left, int right) {
		Node node = sll.head;
		Node runner = null;
		int pos = 1;
		Node prevOfleft = null;
		Node leftNode = null;
		Node nextOfLeft = null;

		Node prevOfRight = null;
		Node rightNode = null;
		Node nextOfRight = null;

		while (node != null) {
			if (pos == left) {
				if (pos == 1) {
					prevOfleft = null;
				} else {
					prevOfleft = runner;
				}
				leftNode = node;
				nextOfLeft = node.next;
			}
			if (pos == right) {
				if (right == sll.size) {
					nextOfRight = null;
				} else {
					nextOfRight = node.next;
				}
				prevOfRight = runner;
				rightNode = node;

			}
			pos++;
			runner = node;
			node = node.next;
		}

		return sll;

	}

//	Roman to decimal
	public static int romanToDecimal(String s) {
//		int value = 0, runner = 0;

		int prev = 0;
		int answer = 0;
		int number = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);

			switch (c) {
			case 'I':
				number = 1;
				break;
			case 'V':
				number = 5;
				break;
			case 'X':
				number = 10;
				break;
			case 'L':
				number = 50;
				break;
			case 'C':
				number = 100;
				break;
			case 'D':
				number = 500;
				break;
			case 'M':
				number = 1000;
				break;
			default:
				number = 0;
			}
			if (number < prev) {
				answer -= number;
			} else
				answer += number;
			prev = number;

		}
		return answer;
	}

	public String longestCommonPrefix(String[] strs) {
		
		StringBuilder s=new StringBuilder();
		String first = strs[0];
		for (int i=0;i<strs.length-1;) {
			
		}
		
		return s.toString();

	}

}
