package hacker;

import java.util.HashMap;
import java.util.Map;

public class SubString {
	public String findSubstring(String s, int k) {
	    // Initialize variables
	    String vowels = "AEIOUaeiou";
	    int maxVowelCount = 0;
	    String maxVowelString = "";

	    // Loop through all substrings of length k
	    for (int i = 0; i <= s.length() - k; i++) {
	        String subString = s.substring(i, i + k);
	        int vowelCount = 0;

	        // Count the number of vowels in the current substring
	        for (int j = 0; j < k; j++) {
	            if (vowels.indexOf(subString.charAt(j)) != -1) {
	                vowelCount++;
	            }
	        }

	        // Update maxVowelCount and maxVowelString if necessary
	        if (vowelCount > maxVowelCount) {
	            maxVowelCount = vowelCount;
	            maxVowelString = subString;
	        }
	    }

	    // Return the result
	    if (maxVowelCount == 0) {
	        return "Not found!";
	    } else {
	        return maxVowelString;
	    }
	}


}
