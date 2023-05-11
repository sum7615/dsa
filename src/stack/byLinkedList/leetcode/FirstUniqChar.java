package stack.byLinkedList.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class FirstUniqChar {
	public int firstUniqChar(String s) {
		char[] chars = s.toCharArray();
		Queue<Character> queue = new LinkedList<>();
		for (int i = 0; i < chars.length; i++) {
			if (!queue.contains(chars[i]) && s.indexOf(chars[i]) == i) {
					queue.add(chars[i]);
			} else {
				queue.remove(chars[i]);
			}
		}
		Character firstUniqueChar = queue.poll();
		if (firstUniqueChar != null) {
			return s.indexOf(firstUniqueChar);
		} else {
			return -1;
		}
	}
}
