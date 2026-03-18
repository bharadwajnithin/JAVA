package String_Methods;

public class String_Methods {

	public static void main(String[] args) {

        // Creating a String
        String str = "Hello, World!";

        // length() → returns total number of characters in the string
        System.out.println("Length: " + str.length());

        // charAt(index) → returns character at given index
        System.out.println("Character at index 7: " + str.charAt(7));

        // substring(startIndex) → returns substring from startIndex to end
        System.out.println("Substring from index 7: " + str.substring(7));

        // substring(startIndex, endIndex) → returns substring from startIndex to endIndex-1
        System.out.println("Substring from 7 to 12: " + str.substring(7, 12));

        // concat() → joins another string to the current string
        System.out.println("Concat: " + str.concat("!!!"));

        // indexOf() → returns first occurrence index of given character/string
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // indexOf(value, fromIndex) → searches from given index
        System.out.println("Index of 'l' from index 4: " + str.indexOf("l", 4));

        // lastIndexOf() → returns last occurrence index
        System.out.println("Last index of 'l': " + str.lastIndexOf("l"));

        // equals() → compares two strings (case-sensitive)
        System.out.println("Equals check: " + str.equals("Hello, World!"));

        // equalsIgnoreCase() → compares two strings ignoring case
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase("hello, world!"));

        // compareTo() → compares two strings lexicographically
        System.out.println("CompareTo: " + str.compareTo("Hello, Java!"));

        // compareToIgnoreCase() → compares two strings ignoring case
        System.out.println("CompareTo Ignore Case: " + str.compareToIgnoreCase("hello, java!"));

        // toLowerCase() → converts all characters to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // toUpperCase() → converts all characters to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // trim() → removes spaces at beginning and end
        String spaceStr = "   Hello Trim   ";
        System.out.println("Trimmed: '" + spaceStr.trim() + "'");

        // replace(oldChar, newChar) → replaces characters
        System.out.println("Replace l with x: " + str.replace('l', 'x'));

        // contains() → checks if string contains given text
        System.out.println("Contains 'World': " + str.contains("World"));

        // toCharArray() → converts string into character array
        char[] arr = str.toCharArray();
        System.out.print("Characters: ");
        for(char c : arr){
            System.out.print(c + " ");
        }
        System.out.println();

        // startsWith() → checks if string starts with given prefix
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));

    }
}