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
		minMax.miniMaxSum(ll);
	}

	
}
//2093989309 2548418794
