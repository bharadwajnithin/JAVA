package BASIC;

import java.util.Scanner;

public class leapyearcheck {

	public static void main(String[] args) {
		// Check whether the given year is leap year

		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER THE YEAR ");
		int a=sc.nextInt();
		
		System.out.println("ENTER THE YEAR ");
		
		if(a%4==0 && a%100!=0||a%400==0){
			System.out.println("its A LEAP YEAR ");
		}
		else{
			System.out.println("its not a leap year ");
		}
	}

}

/*
Example Output 1:
ENTER THE YEAR
2024
its A LEAP YEAR

Example Output 2:
ENTER THE YEAR
2023
its not a leap year
*/