package P1;

import java.io.FileReader;
import java.io.IOException;

public class p1 {

	public static void main(String[] args) {
	
	        try {
	            FileReader file = new FileReader("abc.txt");
	        } catch (IOException e) {
	            System.out.println("Handled file error");
	        }
	        
	    }
	}