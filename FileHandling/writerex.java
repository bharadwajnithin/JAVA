package FileHandling;
import java.io.*;
public class writerex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		FileWriter fw=new FileWriter("D:\\Engee\\Codex DNY\\JAVA  WORKSPACE FOR PERSONAL\\Learning\\src\\FileHandling\\HI.txt");
		fw.write("\n Hi javaaaa hellooo");
		fw.write("\n ok java ");
		fw.close();
		System.out.println("write sucess");
		
		}
		
		catch(IOException e) {
			
			System.out.println("an error occered in :"+e.getMessage());
			
		}
	}

}
