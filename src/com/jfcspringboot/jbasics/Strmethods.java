package com.jfcspringboot.jbasics;

public class Strmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub        
        String str1 = "Hello";
        String str2 = " World";
        String str3 = "Java programming is fun";
        String str4 = "  Hello World  ";

        // Character at a specific index
        char ch = str1.charAt(1);
        System.out.println("Character at index 1 of str1: " + ch);

        // Compare two strings (difference of character value)
        int cmp = str1.compareTo(str2);
        System.out.println("Comparing str1 with str2: " + cmp);

        // Concatenate strings
        String cc = str1.concat(str2);
        System.out.println("Concatenated string: " + cc);

        // Check if string contains a substring
        boolean contain = str3.contains("Java");
        System.out.println("Does str3 contain 'Java'? " + contain);

        // Check if string ends with a suffix
        boolean end = str3.endsWith("fun");
        System.out.println("Does str3 end with 'fun'? " + end);

        // Check if two strings are equal
        boolean equal = str1.equals("Hello");
        System.out.println("Is str1 equal to 'Hello'? " + equal);

        // Check if two strings are equal ignoring case
        boolean equalIgnoreCase = str1.equalsIgnoreCase("hello");
        System.out.println("Is str1 equal to 'hello' ignoring case? " + equalIgnoreCase);

        // Format strings
        String formattedString = String.format("The value of pi is approximately %.2f", Math.PI);
        System.out.println("Formatted string: " + formattedString);

        // Get bytes of the string
        byte[] bytes = str1.getBytes();
        System.out.println("Bytes of str1: " + java.util.Arrays.toString(bytes));

        // Get characters from the string
        char[] charArray = new char[5];
        str1.getChars(0, 5, charArray, 0);
        System.out.println("Characters from str1: " + java.util.Arrays.toString(charArray));

        // Find the index of a substring
        int index = str3.indexOf("programming");
        System.out.println("Index of 'programming' in str3: " + index);

        // Intern string
        String internedStr = str3.intern();
        System.out.println("Interned string: " + internedStr);

        // Check if string is empty
        boolean isEmpty = str1.isEmpty();
        System.out.println("Is str1 empty? " + isEmpty);

        // Join multiple strings
        String joined = String.join("-", str1, str2, str3);
        System.out.println("Joined strings: " + joined);

        // Find the last index of a character
        int lastIndex = str3.lastIndexOf('a');
        System.out.println("Last index of 'a' in str3: " + lastIndex);

        // Get the length of the string
        int len = str3.length();
        System.out.println("Length of str3: " + len);

        // Replace characters in a string
        String replaced = str3.replace("fun", "awesome");
        System.out.println("Replaced 'fun' with 'awesome' in str3: " + replaced);

        // Replace all occurrences of a regex pattern
        String replacedAll = str3.replaceAll(" ", "_");
        System.out.println("Replaced all spaces with underscores in str3: " + replacedAll);

        // Split the string by spaces
        String[] parts = str3.split(" ");
        System.out.println("Splitting str3 by spaces:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Check if string starts with a prefix
        boolean start = str3.startsWith("Java");
        System.out.println("Does str3 start with 'Java'? " + start);

        // Substring from a string
        String sub = str3.substring(5, 16);
        System.out.println("Substring of str3 from index 5 to 16: " + sub);

        // Convert string to character array
        char[] toCharArray = str1.toCharArray();
        System.out.println("Character array of str1: " + java.util.Arrays.toString(toCharArray));

        // Convert string to lower case
        String lower = str3.toLowerCase();
        System.out.println("str3 in lower case: " + lower);

        // Convert string to upper case
        String upper = str3.toUpperCase();
        System.out.println("str3 in upper case: " + upper);

        // Trim leading and trailing spaces
        String trimmed = str4.trim();
        System.out.println("Trimmed str4: '" + trimmed + "'");

        // Convert different types to string
        String valueOfInt = String.valueOf(123);
        System.out.println("String value of integer 123: " + valueOfInt);
        
        String valueOfDouble = String.valueOf(123.45);
        System.out.println("String value of double 123.45: " + valueOfDouble);
	}

}
