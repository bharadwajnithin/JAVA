package BASIC;

public class Swap2Numbers {
	
	public static void main(String[] args) {
		
		// with temp
		{
			int a,b,c;
			a=10;
			b=5;
		
			c=a;
			a=b;
			b=c;
		
			System.out.println(a);
			System.out.println(b);
		}
		
		//without temp variable 
		{
			int a,b;
			
			a=15;
			b=2;
			
			a=a+b;//a=17
			b=a-b;//17-2= 15
			a=a-b;//17-15=2
		}
		
	}
}

/*
Example Output 1:
After swapping using temp
5
10

Example Output 2:
Before swap: a=15 b=2
After swap: a=2 b=15
*/