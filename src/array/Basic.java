package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Basic {
	public static void main(String[] args) {
//		int[] arr= {3,3};
//		System.out.println(Arrays.toString(twoSum(arr, 6)));
		System.out.println(addDigits(38));
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] res = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if(map.containsKey(target-nums[i])) {
				res[1]=i;
				res[0]=map.get(target-nums[i]);
				break;
				
			}else {
				map.put(nums[i], i);
			}
		}
		return res;
	}
	 public static int addDigits(int num) {
		    if (num == 0) {
		        return 0;
		    }
		    return num % 9;
		}

}
