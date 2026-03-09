package LOGIC_PROBLEMS;

import java.util.Scanner;

public class BLANK_HYPEN {

	public static void main(String[] args) {
		// Replace blank spaces with hyphen
		
	String  s="nihitn nihtjn dfjhvgbkhjfd dfgbkrhkjg";
		
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			
			if (c==' ') {
				System.out.print("-");
			}
			else {System.out.print(c);}
		}
	}

}

/*
Example Output 1:
Input String:
nihitn nihtjn dfjhvgbkhjfd dfgbkrhkjg

Output:
nihitn-nihtjn-dfjhvgbkhjfd-dfgbkrhkjg

Example Output 2:
Input String:
hello world java

Output:
hello-world-java
*/