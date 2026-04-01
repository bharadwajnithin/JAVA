package CollectionFramework__;

import java.util.*;

public class QUEUE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> pq=new PriorityQueue<>();
		
		pq.add(3);
		pq.add(13);
		pq.add(22);
		pq.add(7);
		pq.add(12);
		
		
		System.out.println("Queue are :"+pq);
		
		//remove  
		
		pq.remove(3);
		System.out.println("after removing :"+pq);
		
		System.out.println(pq.poll());
		
		System.out.println("after removing :"+pq);
		
		//accesing elements 
		
		System.out.println(pq.peek());
		
		System.out.println(pq);
		
		
		
		
		
		
		

	}

}
