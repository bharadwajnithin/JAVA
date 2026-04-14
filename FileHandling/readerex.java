package FileHandling;
import java.io.*;
public class readerex {
	 public static void main(String[] args) {
	        try {
	            FileReader fr = new FileReader("D:\\Engee\\Codex DNY\\JAVA  WORKSPACE FOR PERSONAL\\Learning\\src\\FileHandling\\HI.txt");

	            int i;
	            while ((i = fr.read()) != -1) {
	                System.out.print((char)i);
	            }

	            fr.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }
	}