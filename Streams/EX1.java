package Streams;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List <Integer> list=Arrays.asList(1,3,45,48,44,6,2,3);
		
		///terminal  forEach()
		/// 
	

		list.stream()
		    .forEach(x -> System.out.print(x+"  "));
		
		
		//collect()

		
		List<Integer> result=list.stream()
				.filter(x->x%2==0)
				.collect(Collectors.toList());


		
		
		/// count 
		long count=list.stream()
		.filter(x->x%2==0)
		.count()
		;	
		
		
		System.out.println("stream  result "+result );
		System.out.println("stream count "+count);
		
		
		
		

	}

}
