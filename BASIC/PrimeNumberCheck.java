package BASIC;

import java.util.Scanner;

public class PrimeNumberCheck {
	
	static boolean prime(int n) {
		for (int i=2;i<n;i++)
			if (n%i==0)
				return false;
		return true;
	}
	

	public static void main(String[] args) {
		// Check whether the number is prime or not
		
		Scanner sc=new  Scanner(System.in);
		
		int n=sc.nextInt();
		if (prime(n)) {
			System.out.println("is prime");
		}else {
			System.out.println("is not ");
		}
;
	}
}

/*
Example Output 1:
Input:
7
is prime

Example Output 2:
Input:
10
is not
*/