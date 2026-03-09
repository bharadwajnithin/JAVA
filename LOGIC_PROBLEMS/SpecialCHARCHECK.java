package LOGIC_PROBLEMS;

public class SpecialCHARCHECK {

	public static void main(String[] args) {
		// Check whether the string contains a special character

		String s="nithi_n ";
		
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);

			if(!((c>='a' && c<='z')||(c>=0 && c<=9))){
				System.out.println("Special cha isfound ");
				return;
			}
		}

		System.out.println("No special char are ");
	}
}

/*
Example Output 1:
Input String: nithi_n
Output:
Special cha isfound

Example Output 2:
Input String: nithin
Output:
No special char are
*/