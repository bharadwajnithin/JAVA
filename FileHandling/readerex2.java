package FileHandling;
import java.io.*;

public class readerex2 {

	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new FileReader("D:\\Engee\\Codex DNY\\JAVA  WORKSPACE FOR PERSONAL\\Learning\\src\\FileHandling\\HI.txt") );
		
		
		String line;
		while((line=br.readLine())!= null) {
			System.out.println(line);
		}
		
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}

}
