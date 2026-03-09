package ARRAY;

public class ARRAY_P_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int arr[] = {1,3,4,-4,-2,5,6};
			int a=arr.length;
			int p[] = new int[arr.length];
			int n[]= new int[arr.length];
			int pc=0;
			int nc=0;
			
			
			
			
			for (int i=0;i<arr.length;i++) {
				
				if (arr[i]>0)
				{
					p[pc]=arr[i];
					pc++;			
									
					
				}				
				else {
					n[nc]=arr[i];
					nc++;
					
				}
				
			}
			
			System.out.println("positive nmumbers ");
			
			for(int i=0;i<pc;i++) {
				System.out.println(p[i]);
			}
			
System.out.println("negative  nmumbers ");
			
			for(int i=0;i<nc;i++) {
				System.out.println(n[i]);
			}
			
			
			
	}

}
