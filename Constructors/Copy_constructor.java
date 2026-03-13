package Constructors;

public class Copy_constructor {
	
	String name;
	int id;

	Copy_constructor(String name,int id ){
		this.name=name;
		this.id=id;
		
		System.out.println("name :"+name+"id :"+id);
	}
	
	Copy_constructor(Copy_constructor obj){
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		
		System.out.println("first :");
		Copy_constructor ob=new Copy_constructor("nithin ",403);
		
		System.out.println("second or copy ");
		Copy_constructor obj=new Copy_constructor(ob);
	}

}

/*
Example Output:
first :
name :nithin id :403
second or copy
*/