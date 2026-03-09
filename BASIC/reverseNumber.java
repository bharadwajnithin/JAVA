package BASIC;

public class reverseNumber {

	public static void main(String[] args) {
		// Reverse number and string
		
		int n =1234;
		int a=0;

		while (n>0) {
			int d= n%10;//gets last digit 
			n=n/10;// remove last digit 
			a=a*10+d;
		}

		System.out.println(a);

		//reversestring
		{
			String O="NithinBHARADWAJ";
			String R="";

			for (int i=O.length()-1;i>=0;i--) {
				R+=O.charAt(i);
			}

			System.out.println("reverts string isd "+R);
		}
	}

}

/*
Example Output 1:
Input Number: 1234
4321

Example Output 2:
Input String: NithinBHARADWAJ
reverts string isd JAWDARAHBnihtiN
*/