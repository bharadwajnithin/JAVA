package BASIC;

import java.util.Scanner;

public class MTable {

	public static void main(String[] args) {
		// Print multiplication table

		Scanner sc =new Scanner(System.in);
		
		int n=10;
		System.out.println("Enter the table number :");
		int m=sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println(m+"*"+i+"="+m*i);
		}
				
	}

}

/*
Example Output 1:
Enter the table number :
5
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
5*6=30
5*7=35
5*8=40
5*9=45
5*10=50

Example Output 2:
Enter the table number :
3
3*1=3
3*2=6
3*3=9
3*4=12
3*5=15
3*6=18
3*7=21
3*8=24
3*9=27
3*10=30
*/