package problemSolving;
//   https://www.hackerrank.com/challenges/one-month-preparation-kit-plus-minus/problem

import java.util.List;

public class ElementsRatios {
	public  void plusMinus(List<Integer> arr) {
		int ps=0,ng=0,zero=0;
		for(int i:arr ) {
			if(i>0) {
				ps++;
			}else if(i<0) {
				ng++;
			}else if(i==0) {
				zero ++;
			}
		}
		System.out.printf("%6f %n",(double) ps/arr.size());
		System.out.printf("%6f %n",(double)ng/arr.size());
		System.out.printf("%6f %n",(double)zero/arr.size());
		

	}
}
