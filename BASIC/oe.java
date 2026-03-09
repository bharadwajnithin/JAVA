package BASIC;
import java.math.*;
import java.util.Scanner;

public class oe {
	
	public static void main(String[] args) {
		// Check whether the number is even or odd
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter the numberb :");
		int n=sc.nextInt();
		
		if ( n%2==0) {
			System.out.println("its a even ");
		}else {
			System.out.println("is a odd num,ber ");
		}
	}

}

/*
Example Output 1:
Enter the numberb :8
its a even 

Example Output 2:
Enter the numberb :7
is a odd num,ber 
*/