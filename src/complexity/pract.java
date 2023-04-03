package complexity;

public class pract {
	public static void main(String[] args) {
		int[] a= {9,3,5};
//		int[] res=sumAndMultiply(a);
//		System.out.println(res[0]);
//		System.out.println(res[1]);
		
		printPair(a);
		
		
		
	}
	
	public static int[] sumAndMultiply(int[] arr) {
		int[] ret = {0,1};
		for(int i=0;i<arr.length;i++) {
			ret[0]+=arr[i];
			ret[1]*=arr[i];
		}
		return ret;
	}
	
	
	public static void printPair(int[] arr) {
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				System.out.println(arr[i]+""+arr[j]);
			}
		}
	}
	
	
}
