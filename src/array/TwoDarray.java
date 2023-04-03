package array;

public class TwoDarray {
	public static void main(String[] args) {
		int [][] arr = {{1,2},{3,4},{5,6}};
		traversal(arr);

	}

	public static void traversal(int[][] arr) {
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println();
		}
	}
}
