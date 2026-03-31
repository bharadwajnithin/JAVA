package CollectionFramework__;
import java.util.*;

public class SET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s=new HashSet<>();
		
		s.add("N");
		s.add("i");
		s.add("t");
		s.add("h");
		s.add("i");
		s.add("N");
		
		
		System.out.println("The set are :  "+s);
		
		//accesing  elements 

		System.out.println(s.contains("D"));
		
		
		//removing element
		
		s.remove("N");
		System.out.println("after the remove elements :"+s);
		
		
		for (String Val:s) {
			System.out.print(Val+" ,")
			;
		}System.out.println();
		
		
	}

}
