package StringCLASSES.stringbuilder;

public class stringbuilder_with_methods {

	public static void main(String[] args) {
		// Using different StringBuilder methods
		
		StringBuilder s=new StringBuilder();
		
		s.append("Java Programming ");
		System.out.println(s);
		
		s.insert(4,"is ");
		System.out.println("after insert"+s);
	  
		s.replace(5,6,"PR");
		System.out.println("after replace"+s);
		
		s.reverse();
		System.out.println("aft6er reverse ");
		
        System.out.println("Capacity: " + s.capacity());
        System.out.println("Length: " + s.length());
        
        char c = s.charAt(5);
        System.out.println("character at "+c);
        
        s.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + s);
	}

}

/*
Example Output 1:
Java Programming 
after insertJava is Programming 
after replaceJava PRs Programming 
aft6er reverse 
Capacity: 34
Length: 20
character at g
After deleteCharAt: ...

Example Output 2:
Java Programming 
after insertJava is Programming 
after replaceJava PRs Programming 
aft6er reverse 
Capacity: 34
Length: 20
character at g
After deleteCharAt: ...
*/