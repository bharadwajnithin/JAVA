package LOGIC_PROBLEMS;

import java.util.Scanner;

public class StringCONV {

	
	public static void main(String[] args) {
		// Program starts here
		
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the string :");	
	String s=sc.next();
		
;
		
		// Loop through each character of the string
		for (int i=0; i<s.length();i++ ) {				
			
			// If index is odd, print '*'
			if (i%2==1) {
				System.out.print("*");
				continue;
				
			}
			
			// If index is even, print the character
			System.out.print(s.charAt(i));
		}
	}

}

/*
Example Output 1:
enter the string : nithin
n*t*i*

Example Output 2:
enter the string : hello
h*l*o
*/