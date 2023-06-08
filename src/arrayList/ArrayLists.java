package arrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

//package arrayList;

public class ArrayLists {
	public static void main(String[] args) {
//		Creating ArrayList: Time and space complexity O(1)
		
		
		
				
//		Heterogenious data type
		ArrayLists arrayList = new ArrayLists();
		
//		Homogenious data type => only specific type of data can be stored. "30" is the customised size of intialization.
		ArrayList<Integer> intArrayList = new ArrayList<Integer>(30);
		
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(32,12,3,5432));
//		System.out.println(numbers);
		
//		intserting at Array List
		
//		using add(element) method. Time and space complexity is O(1)
		intArrayList.add(110);
		intArrayList.add(2);// insertig at the end
		
//		using add(index,element) method. Time complexity is ON1) and space complexity is O(1)
		intArrayList.add(2,3); //inserting at 2 index. at the last of the array.
		
//		intArrayList.add(4,4);     //inserting at the index which is greater then size. so it will give exception 
		
		System.out.println(intArrayList);
//		Accessing element by get(index) method. Time complexity O(1) and space complexity O(1)
		
//		System.out.println(intArrayList.get(0));
		
		
//		Traversal of ArrayList. Time complexity O(N) and space complexity O(1)
		
//		for loop
//		System.out.println("By for loop");
//		for(int i=0;i<intArrayList.size();i++) {
//			System.out.println(intArrayList.get(i));
//		}
//		System.out.println();
		
//		forEach loop
//		System.out.println("By forEach loop");
//		for (Integer i : intArrayList) {
//			System.out.println(i);
//		}
//		System.out.println();
		
//		iterator
//		System.out.println("By Iterator");
//		Iterator<Integer> itr = intArrayList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		System.out.println();
		
//		Searching an element. Time complexity O(N) and space complexity O(1)
		
		//forEach loop
//		for(int i: intArrayList ) {
//			if(i==10) {
//				System.out.println("Found");
//				break;
//			}else {
//				System.out.println("Not found");
//				break;
//			}
//		}
		
		
//		Removing an element from ArrayList. Time complexity O(N) and space complexity O(1)
		

		//		using remove(index) 
		intArrayList.remove(1);
		
//		using remove(object/element) 
		System.out.println(intArrayList.remove(Integer.valueOf(20)));//in case of we have to use Integer.valueOf(element) to define element. 
		
		
		
		
	}
}
