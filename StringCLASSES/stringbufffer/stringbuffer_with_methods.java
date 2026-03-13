package StringCLASSES.stringbufffer;

public class stringbuffer_with_methods {

	public static void main(String[] args) {
		// Using different StringBuffer methods
		
		StringBuffer s=new StringBuffer();
		
		s.append("nithin bharadwaj");
		System.out.println("String orignal is :"+s);
		
		s.insert(0,"KS ");
		System.out.println("after insert:"+s);
		
		s.replace(3, 4, "NI");
		System.out.println("after the replace :"+s);
		
		s.reverse();
		System.out.println("its a reverse string "+s);
		
		s.delete(0, 1);
		System.out.println("after delete ");
	}

}

/*
Example Output:
String orignal is :nithin bharadwaj
after insert:KS nithin bharadwaj
after the replace :KS NIithin bharadwaj
its a reverse string jawdarahb nihtiiN SK
after delete
*/