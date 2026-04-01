package CollectionFramework__;
import java.util.*;

public class Map_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String,Integer>m=new HashMap<>();
		
		m.put("N",1);
		m.put("I", 3);
		m.put("T", 4);
		m.put("H", 5);
		
		System.out.println("MAP are :"+m);
		
		Map<Integer, String> hm1
        = new HashMap<Integer, String>();

    // Inserting the Elements
    hm1.put(new Integer(1), "Geeks");
    hm1.put(new Integer(2), "Geeks");
    hm1.put(new Integer(3), "Geeks");

    System.out.println("Initial Map: " + hm1);

    hm1.put(new Integer(2), "For");

    System.out.println("Updated Map: " + hm1);
    
    
    hm1.remove(new Integer(3));
    System.out.println(hm1);
    
    

	}

}
