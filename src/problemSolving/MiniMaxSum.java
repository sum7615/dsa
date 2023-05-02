package problemSolving;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MiniMaxSum {
	public void miniMaxSum(List<Integer> arr) {
		Collections.sort(arr);
		long minSum=0,maxSum=0;
		for(int i=0;i<arr.size();i++) {
			if(i>=0 &&i<arr.size()-1) {
				minSum+=arr.get(i);
			}
			if(i>0&&i< arr.size()) {
				maxSum+=arr.get(i);
			}
		}
		System.out.printf("%d %d",minSum,maxSum);
	}
}
