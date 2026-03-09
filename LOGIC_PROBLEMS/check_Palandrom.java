package LOGIC_PROBLEMS;

public class check_Palandrom {

	public static void main(String[] args) {
		
		// Check whether the string is palindrome
		
		String O="nin";
		String R="";

		for (int i=O.length()-1;i>=0;i--) {
			R+=O.charAt(i);
		}
		
		if (O.equals(R)){
			System.out.println("PALANDROM");
		}
		else {
			System.out.println("NOT PALANDROM ");
		}
		
		System.out.println("reverts string isd "+R);

	}

}

/*
Example Output 1:
Input String: nin
PALANDROM
reverts string isd nin

Example Output 2:
Input String: hello
NOT PALANDROM
reverts string isd olleh
*/