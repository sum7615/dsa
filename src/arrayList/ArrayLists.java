package arrayList;
import java.util.ArrayList;
import java.util.Arrays;

//package arrayList;

public class ArrayLists {
	public static void main(String[] args) {
//		Heterogenious data type
		ArrayLists arrayList = new ArrayLists();
		
//		Homogenious data type => only specific type of data can be stored. "30" is the customised size of intialization.
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(30);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(32,12,3,5432));
		System.out.println(numbers);
		
	}
}
