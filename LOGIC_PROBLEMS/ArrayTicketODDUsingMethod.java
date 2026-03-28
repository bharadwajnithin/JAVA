package LOGIC_PROBLEMS;

import java.util.Scanner;

public class ArrayTicketODDUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size = ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		arraytic(arr);
	}
	
	static void arraytic(int[] arr) {
		
		int sum=0;
		int count = 0 ;
		for(int i=0; i<arr.length; i++) {
			if ( i % 2 ==1) {
				sum +=arr[i];
				count++;
			}
		}
		
		System.out.println("total = " + sum);
		System.out.println("coutn = " + count);
		System.out.println("Average is = " + sum/count);
	}}