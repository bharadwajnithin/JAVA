package LOGIC_PROBLEMS;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
System.out.println("enter thee array in space:");		
		int arr[]=new int[4];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}		
			arrin(arr);
				
		}

	static void arrin(int[] arr) {		
		
		for (int i=0;i<arr.length;i++) {
			boolean isdup=false;
			
			for(int j=i+1;j<arr.length;j++) {
			
			if(arr[i]==arr[j]) {
				isdup=true;	
			}
			}
			if(!isdup) {
				System.out.println(arr[i]+"");
			}
						
					
			
		}
		

	}}