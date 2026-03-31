package CollectionFramework__;
import java.util.*;

public class TREESET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> t=new TreeSet<>();
		
		t.add("N");
		t.add("I");
		t.add("T");
		t.add("H");
		t.add("I");
		t.add(" ");
		
		System.out.println("Tree Set is :"+t);
		
		
		//accesing elements ()
		
		System.out.println("accesisng element "+t.contains("N"));
		;
		
		System.out.println();
		
		//removing elements 
		
		t.remove("N");
		
		
		System.out.println("after the tree set removing the elements "+t);
		
		

	}

}
