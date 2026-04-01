package CollectionFramework__;
import java.util.*;
public class DEQUEUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Deque<String> dq=new ArrayDeque();
		
		dq.add("for ");
		dq.addFirst("geeks");
		dq.addLast("geeks");
		dq.addLast("geekss");
		
		
		
		System.out.println("Deque is :"+dq);
		
		
		
		String f = dq.removeFirst();
        String l = dq.removeLast();

        // Displaying the Deque
        System.out.println("First: " + f + ", Last: " + l);
        
        //OR 
		
		System.out.println(dq.pop());
	      
        System.out.println(dq.poll());
      
        System.out.println(dq.pollFirst());
      
        System.out.println(dq.pollLast());
		
		
		
		
		
		
		

	}

}
