package leetcode;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class FindDifference {
	
	public static List<Integer> minChairs(List<String> simulations) {
	    List<Integer> result = new ArrayList<>();
	    for (String simulation : simulations) {
	        int chairsPurchased = 0;
	        int chairsAvailable = 0;
	        for (char c : simulation.toCharArray()) {
	            if (c == 'C') {
	                if (chairsAvailable == 0) {
	                    chairsPurchased++;
	                } else {
	                    chairsAvailable--;
	                }
	            } else if (c == 'R' || c == 'L') {
	                chairsAvailable++;
	            } else if (c == 'U') {
	                if (chairsAvailable == 0) {
	                    chairsPurchased++;
	                } else {
	                    chairsAvailable--;
	                }
	            }
	        }
	        result.add(chairsPurchased);
	    }
	    return result;
	}


}
