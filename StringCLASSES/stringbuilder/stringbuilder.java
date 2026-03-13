package StringCLASSES.stringbuilder;

public class stringbuilder {

	public static void main(String[] args) {
		// Different constructors of StringBuilder
		
		StringBuilder sb1 = new StringBuilder();
	    sb1.append("Hello");
	    System.out.println("sb1: " + sb1);

	    StringBuilder sb2 = new StringBuilder(50);
	    sb2.append("This has initial capacity 50");
	    System.out.println("sb2: " + sb2);

	    StringBuilder sb3 = new StringBuilder("Geeks");
	    sb3.append("ForGeeks");
	    System.out.println("sb3: " + sb3);

	    CharSequence cs = "Java";
	    StringBuilder sb4 = new StringBuilder(cs);
	    sb4.append("Programming");
	    System.out.println("sb4: " + sb4);

	}

}

/*
Example Output 1:
sb1: Hello
sb2: This has initial capacity 50
sb3: GeeksForGeeks
sb4: JavaProgramming

Example Output 2:
sb1: Hello
sb2: This has initial capacity 50
sb3: GeeksForGeeks
sb4: JavaProgramming
*/