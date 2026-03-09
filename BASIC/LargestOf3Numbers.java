package BASIC;

import java.util.Scanner;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		// Find the largest among three numbers

		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the numberb 1 :");
		int a=sc.nextInt();
		System.out.print("Enter the numberb 2:");
		int b=sc.nextInt();
		System.out.print("Enter the numberb 3:");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is largest ");
		}else if(b>a && b>c) {
			System.out.println(" B is largest ");
		}else {
			System.out.println("C is the larges t  ");
		}
	}

}

/*
Example Output 1:
Enter the numberb 1 :10
Enter the numberb 2:25
Enter the numberb 3:15
 B is largest

Example Output 2:
Enter the numberb 1 :50
Enter the numberb 2:20
Enter the numberb 3:30
A is largest
*/