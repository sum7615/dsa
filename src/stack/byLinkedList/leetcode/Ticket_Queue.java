package stack.byLinkedList.leetcode;

import java.security.KeyPair;
import java.security.interfaces.DSAKeyPairGenerator;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class pair {
	int key;
	int value;
	public pair(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}

}

public class Ticket_Queue {
	public int timeRequiredToBuy(int[] tickets, int k) {
		Queue<pair> queue = new ArrayDeque<>();
		for (int i = 0; i < tickets.length; i++) {
			queue.offer(new pair(i, tickets[i]));
		}
		int count = 0;
		while (!queue.isEmpty()) {
			pair temp = queue.poll();
			count += 1;
			if (temp.value > 1) {
				queue.offer(new pair(temp.key, temp.value-1));
			}else if(temp.value == 1 && temp.key == k) {
				return count;
			}
			
			

		}
		return count;
	}
}

