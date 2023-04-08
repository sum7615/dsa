package arrayList;
import java.util.ArrayList;
import java.util.Arrays;

//package arrayList;

public class ArrayLists {
	public static void main(String[] args) {
		
//		Creating ArrayList: Time and space complexity O(1)
		
//		Heterogenious data type
		ArrayLists arrayList = new ArrayLists();
		
//		Homogenious data type => only specific type of data can be stored. "30" is the customised size of intialization.
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(30);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(32,12,3,5432));
		System.out.println(numbers);
		
//		intserting at Array List
		
//		using add(element) method. Time and space complexity is O(1)
		intArrayList.add(1);
		intArrayList.add(2);// insertig at the end
		
//		using add(index,element) method. Time complexity is ON1) and space complexity is O(1)
		intArrayList.add(2,3); //inserting at 2 index. at the last of the array.
		
//		intArrayList.add(4,4);     //inserting at the index which is greater then size. so it will give exception 
		
//		Accessing element by get(index) method. Time and space complexity O(N)
		
		System.out.println(intArrayList.get(0));
		
	}
}
