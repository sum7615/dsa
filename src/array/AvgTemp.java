package arrayo;

import java.util.Scanner;

//need of git puill before pushing

// Demo of git


//Changing the code in beetween 
public class AvgTemp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many Days?");
		int daysNo = sc.nextInt();
		int[] temp = new int [daysNo];
		int count=0;
		int sum = 0;
		for(int i=0;i<temp.length;i++) {
			System.out.print("Day "+(i+1)+" temp: ");
			temp[i]=sc.nextInt();
			sum+=temp[i];
		}
		float avgTemp=(float)sum/(float)daysNo;
		
		for(int i=0;i<temp.length;i++) {
			if(temp[i]>avgTemp) {
				count++;
			}
		}
		System.out.println("Average Temperature "+avgTemp);
		System.out.println(count+" days is above average");
	}
	
}
