package CollectionFramework__;

import java.util.*;

public class LINKEDLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> l=new LinkedList<String>();
		
		
		 l.add("N");
		 l.add("i");
		 l.add("t");
		 l.add("h");
		 l.add("i");
		 l.add("n");
		 
		 System.out.println("A linked list iis "+l);
		 
		 LinkedList<String> l2=new LinkedList<String>();
		 
		 l2.addAll(l);
		 System.out.println("its as L2: 	"+l2)	;
		 
		 
		 l.remove(0);
		 System.out.println("remove  or deleting the 1st index "+l);
		 
		 l.remove("i");
		 System.out.println("remover the specfic the word   "+l);
		 
		 l.set(0, "N");
		 System.out.println("after  update  the 1st index "+l);
		 
		

	}

}
