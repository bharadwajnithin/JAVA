package CollectionFramework__;
import java.util.*;

public class ARRAYLIST {
	
	public static void main(String[]args) {
		
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(10);
		a.add(12);
		a.add(4);
		
		System.out.println("the array list is :"+a);
		
		a.add(32);
		
		System.out.println("the array list is :	"+a);
		
		a.add(1,22);
		System.out.println("add to 1st place	"+a);
		
		
		a.remove(2);
		System.out.println("removeing the 2nd index	"+a);
		
		a.set(3,5);
		System.out.println("updating the 3rd ondex	"+a);
		System.out.println("array list size  shows :	"+a.size());
		
		
		
		
	}
	
	

}
