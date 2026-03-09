package BASIC;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// Check whether number is positive, negative, or zero
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the numberb :");
		int n=sc.nextInt();
		
		if (n>0) {
			System.out.println("number is positive ");
		}else if (n==0) {
			System.out.println("number is zoroooooo");
		}
		else {
			System.out.println("number is negative ");
		}
	}

}

/*
Example Output 1:
Enter the numberb :10
number is positive 

Example Output 2:
Enter the numberb :-5
number is negative 
*/