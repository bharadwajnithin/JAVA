package FileHandling;
import java.io.*;
public class writerex2 {
	
	public static void main(String[] args) {
		
		
		try(Writer wr=new FileWriter("D:\\Engee\\Codex DNY\\JAVA  WORKSPACE FOR PERSONAL\\Learning\\src\\FileHandling\\HI.txt",true)){
			wr.write("\n this sis a append line");
			
			System.out.println("data write sucess");
		}catch(IOException e) {
			e.printStackTrace();
		}
			
			
		}
	}


