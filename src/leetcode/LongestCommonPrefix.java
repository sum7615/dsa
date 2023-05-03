package leetcode;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		StringBuilder strBuilder = new StringBuilder();
		for (int i = 0; i < strs.length; i++) {

			for (int j = 1; j < strs.length; j++) {
				char[] ch = strs[i].toCharArray();
				char[] ch2 = strs[j].toCharArray();
				for (int k = 0; k < ch.length; k++) {
					if(ch[k]==ch2[k]) {
						strBuilder.append(false)
						
						
					}
				}

			}
		}
		return "";
	}
}
