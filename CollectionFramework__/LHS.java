package CollectionFramework__;
import java.util.*;
public class LHS{

	public static void main(String[] args) {
		
		LinkedHashSet <String> Lh=new LinkedHashSet();	
		
		
		Lh.add("apple");
		Lh.add("banana");
		Lh.add("oirange");
		Lh.add("cherry");
		
	
		System.out.println("Linked Hash Set are : "+Lh);
		
		
		Lh.remove("apple");
		
		System.out.println("after th removing the LHS"+Lh);
		
		
		
		
		for (String val:Lh) {
		System.out.print(val+",");
		}
		
		
		

	}

}
