package StringCLASSES.stringbufffer;

public class Plandromin_stringBuffer {

	public static void main(String[] args) {
		// Check palindrome using StringBuffer
		
		String str="nin";
		StringBuffer sb1 = new StringBuffer(str);		 
	        
	    System.out.println("Default Constructor: " + sb1);	       
	        
	    String s=sb1.reverse().toString();
	        
	    System.out.println("reverse "+s);
	        
	    if (str.equals(s)) {
	        System.out.println("is a palandrom");
	    }else {
	        System.out.println("Not ");
	    }

	}
}

/*
Example Output 1:
Input String: nin
Default Constructor: nin
reverse nin
is a palandrom

Example Output 2:
Input String: hello
Default Constructor: hello
reverse olleh
Not
*/