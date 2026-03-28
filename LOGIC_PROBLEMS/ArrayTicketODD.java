package LOGIC_PROBLEMS;
import java.util.*;

public class ArrayTicketODD {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
System.out.println("enter the size of array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int sum=0;
	int	count=0;
		
	System.out.println("Enrter the array with space:");
	
	for (int i=0;i<arr.length;i++) {		
		arr[i]=sc.nextInt();
				
	}
	
	//core 
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2!=0) {
			sum+=arr[i];
			count++;
			
			
			}
		
		
	}
	
	System.out.println("sum of odd="+sum+"    count of odd price :"+count+"    average of odd price "+sum/count);
	
	}

}
