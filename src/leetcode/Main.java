package leetcode;

import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		FindDifference fd = new FindDifference();
		List<String> gg = Arrays.asList("CCRUCL", "CRUC", "CCCC");

		System.out.println(fd.minChairs(gg));
	}
}
