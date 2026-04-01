package LOGIC_PROBLEMS;
import java.lang.reflect.Array;
import java.util.*;


public class ConcatenationOfArray {
	
	public static int [] arr1(int arr[]) {
		int size=arr.length;
		int i ;
			
			int ans[]=new int [size*2];
			
			for (i=0;i<arr.length;i++) {		
				
				ans[i]=arr[i];
				ans[i+size]=arr[i];	
				
				
			}
			
			return ans;
			
			}
			
		
			
			
			
			
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			
		int arr[]= {1,3,1};
		int anss[]=arr1(arr);
		System.out.println(Arrays.toString(anss));
		
						
		}

	
	
	
		

	}


