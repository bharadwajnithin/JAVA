package P1;
//A simple Java program to demonstrate
//Tic-Tac-Toe Game
import java.util.*;

interface cl{
	public int i=10;
	 void display ();
	 
}

class test implements cl{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
		
		System.out.println("number is "+i);
	}
	
}

class Main { 
    
    
    
    public static void main(String[] args) {
        
    	test t =new test();
    	t.display();
        
    }
}