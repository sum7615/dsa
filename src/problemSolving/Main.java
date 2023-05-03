package problemSolving;

import java.util.Arrays;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		ElementsRatios er = new ElementsRatios();
		MiniMaxSum minMax= new MiniMaxSum();
//		    396285104 573261094 759641832 819230764 364801279

		List<Integer> ll = Arrays.asList(396285104,573261094,759641832,819230764,364801279);

//		er.plusMinus(ll);
//		minMax.miniMaxSum(ll);
		
		TimeConversion tc = new TimeConversion();
//		System.out.println(tc.timeConversion("12:45:54PM"));
		MatchingStrings ms =new MatchingStrings();
		List<String> strings =Arrays.asList("ab","ab","abc");
		List<String> queries=Arrays.asList("ab","abc","bc");
		ms.matchingStrings(strings, queries);
		
		
		
	}

	
}

