package CollectionFramework__;
import java.util.*;
public class Iterator_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String> list=new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("c");
		
		
		Iterator<String> it=list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
