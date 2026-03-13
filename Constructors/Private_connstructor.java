package Constructors;

public class Private_connstructor {

	private Private_connstructor(){
		// Private constructor
		System.out.println("its a private constructor of a class ");
	}
	
	public static void main(String[] args) {
		
		Private_connstructor ob=new Private_connstructor();
	}

}

/*
Example Output:
its a private constructor of a class 
*/