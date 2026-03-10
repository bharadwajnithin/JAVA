package ARRAY;

import java.util.Scanner;

public class MDArray_in_runtime {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the nu of rows:");
		int r = sc.nextInt();

		System.out.println("Enter  no of columns ");
		int c = sc.nextInt();

		System.out.println("enter the array :");

		int arr[][] = new int[r][c];

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++)
				arr[i][j] = sc.nextInt();
		}

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(" " + arr[i][j]);
			}
			System.out.println(" ");
		}
	}
}

/*
Example Input:
enter the nu of rows:
2
Enter  no of columns
2
enter the array :
1 2
3 4

Output:
 1 2
 3 4
*/