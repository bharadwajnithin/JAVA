package LOGIC_PROBLEMS;

import java.util.Scanner;

public class Bill_generation {

	public static void main(String[] args) {
		// Electricity bill calculation
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the you electricty units P:");
		int n=sc.nextInt();
		
		
		if (n<=100) {
			System.out.println("FREE BILL");
		}
		else if (n>100 && n<=200) {
			System.out.println("5 Rs per unit is "+5*n);
		}
		
		else {
			System.out.println("you  unit is more than 200 "+n+"unit is you bill is "+10*n);
		}
		
	}

}

/*
Example Output 1:
Enter the you electricty units P:80
FREE BILL

Example Output 2:
Enter the you electricty units P:150
5 Rs per unit is 750
*/