package LOGIC_PROBLEMS;
import java.util.*;


public class Array_product {

	
		public static void main(String[]args) {
			
			
			Scanner sc=new Scanner(System.in);
			
			System.out.print("enter the sizeof  elements");
			
			int n=sc.nextInt();
			int p=1;
			
			int arr[]=new int[n];
			
			System.out.print("enter the arrays :");
			
			for (int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
				
			}
			
			//main function
			
			for (int i=0;i<arr.length;i++) {
				
				if (arr[i]>0) {
				p*=arr[i];
				}
			
				
			}
			System.out.println("product "+p);
			
		
			
			
			}
			
		}

