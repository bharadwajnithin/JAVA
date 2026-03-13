package Constructors;

public class Parameterized_Constructor {

	String name;
	int id;
	
	Parameterized_Constructor (String name,int id){
		this.name=name;
		this.id=id;
		 
		System.out.println("name and id iis :::"+name+id);
	}

	public static void main(String[] args) {
		
		Parameterized_Constructor ob=new Parameterized_Constructor ("Nithin",88);
				
	}

}

/*
Example Output:
name and id iis :::Nithin88
*/