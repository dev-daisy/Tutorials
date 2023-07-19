package demo.w3school.string;

public class StringMethods {
	public static void main(String args[]){

		// Java String charAt() Method
		// Return the first character (0) of a string:
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		// Definition and Usage
		// The charAt() method returns the character at the specified index in a string.
		// The index of the first character is 0, the second character is 1, and so on.


		// Java String codePointAt() Method
		// Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
		myStr = "Hello";
		int intResult = myStr.codePointAt(0);
		System.out.println(intResult);
		// Definition and Usage
		// The codePointAt() method returns the Unicode value of the character at the specified index in a string.
		// The index of the first character is 0, the second character is 1, and so on.


		// Java String codePointBefore() Method
		// Return the Unicode of the first character in a string (the Unicode value of "H" is 72):
		myStr = "Hello";
		intResult = myStr.codePointBefore(1);
		System.out.println(intResult);
		// Definition and Usage
		// The codePointBefore() method returns the Unicode value of the character before the specified index in a string.
		// The index of the first character is 1, the second character is 2, and so on.
		// Note: The value 0 will generate an error, as this is a negative number (out of reach).


		// Java String codePointCount() Method
		myStr = "Hello";
		intResult = myStr.codePointCount(0, 5);
		System.out.println(intResult);
		// Definition and Usage
		// The codePointCount() method returns the number of Unicode values found in a string.
		// Use the startIndex and endIndex parameters to specify where to begin and end the search.
		// The index of the first character is 0, the second character is 1, and so on.


		// Java String compareTo() Method
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal


		// Java String compareToIgnoreCase() Method
		myStr1 = "HELLO";
		myStr2 = "hello";
		System.out.println(myStr1.compareToIgnoreCase(myStr2));


		// Java String concat() Method
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));


		// Java String contains() Method
		myStr = "Hello";
		System.out.println(myStr.contains("Hel"));   // true
		System.out.println(myStr.contains("e"));     // true
		System.out.println(myStr.contains("Hi"));    // false

		// Java String contentEquals() Method
		myStr = "Hello";
		System.out.println(myStr.contentEquals("Hello"));  // true
		System.out.println(myStr.contentEquals("e"));      // false
		System.out.println(myStr.contentEquals("Hi"));     // false


		// Java String copyValueOf() Method
		char[] myStr3 = {'H', 'e', 'l', 'l', 'o'};
		String myStr4 = "";
		myStr2 = myStr2.copyValueOf(myStr3, 0, 5);
		System.out.println("Returned String: " + myStr4);


		// Java String endsWith() Method
		myStr = "Hello";
		System.out.println(myStr.endsWith("Hel"));   // false
		System.out.println(myStr.endsWith("llo"));   // true
		System.out.println(myStr.endsWith("o"));     // true


		// Java String equals() Method
		myStr1 = "Hello";
		myStr2 = "Hello";
		myStr4 = "Another String";
		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
		System.out.println(myStr1.equals(myStr4)); // false


		// Java String equalsIgnoreCase() Method
		myStr1 = "Hello";
		myStr2 = "HELLO";
		myStr4 = "Another String";
		System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
		System.out.println(myStr1.equalsIgnoreCase(myStr4)); // false


		// Java String String.format() Method
		// Returns a formatted string using the specified locale, format string, and arguments
		myStr = String.format("Hello %s, %d", "world", 42);
		System.out.println(myStr);


		// Java String String.getBytes() Method
		// In Java, getBytes() encodes a string into a sequence of bytes using the named character set and storing the result into a new byte array. This function can be implemented in two ways.
		// Both ways are discussed below as follows:
		String gfg = "Geeks for Geeks";
		byte[] b = gfg.getBytes();// Display message only
        System.out.println( "The String after conversion is : ");
        // Printing converted string after conversion
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]);
        }


		// Java String String.getChars() Method
		// The java string getChars() method copies characters from the given string into the destination character array.
        String str = "Welcome! to GeeksforGeeks";

        char[] destArray = new char[20];
        try {
            str.getChars(12, 25, destArray, 0);
            System.out.println(destArray);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }


		// Java String String.hashCode() Method
        myStr = "Hello";
        System.out.println(myStr.hashCode());


        // Java String indexOf() Method
        myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet"));


        // Java String indexOf() Method
        // String Interning is a method of storing only one copy of each distinct String Value, which must be immutable.
        // Applying String.intern() on a couple of strings will ensure that all strings having the same contents share the same memory.

        // S1 refers to Object in the Heap Area
        // Line-1
        String s1 = new String("GFG");

        // S2 refers to Object in SCP Area
        // Line-2
        String s2 = s1.intern();

        // Comparing memory locations
        // s1 is in Heap
        // s2 is in SCP
        System.out.println(s1 == s2);

        // Comparing only values
        System.out.println(s1.equals(s2));

        // S3 refers to Object in the SCP Area
        // Line-3
        String s3 = "GFG ";
        System.out.println(s2 == s3);


        // Java String isEmpty() Method
        myStr1 = "Hello";
        myStr2 = "";
        System.out.println(myStr1.isEmpty());
        System.out.println(myStr2.isEmpty());


        // Java String lastIndexOf() Method
        myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.lastIndexOf("planet"));


        // Java String length() Method
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(txt.length());


        // Java String matches() Method
        // Declaring and initializing a string
        // Input string
        String Str = new String("Welcome to geeksforgeeks");
        System.out.print(
            "Does String contains regex (.*)geeks(.*) ? : ");
        // Testing if regex is present or not
        System.out.println(Str.matches("(.*)geeks(.*)"));
        System.out.print(
            "Does String contains regex geeks ? : ");
        // Testing if regex is present or not
        System.out.println(Str.matches("geeks"));


        // Java String offsetByCodePoints() Method
        str = "welcome to tutorialspoint";
        System.out.println("string = " + str);
        // returns the index within this String
        int retval = str.offsetByCodePoints(2, 4);
        // prints the index
        System.out.println("index = " + retval);


        // Java String regionMatches() Method
        // create three string objects
        String str1 = new String("Abhishek Rout");
        String str2 = new String("abhishek");
        String str3 = new String("ABHISHEK");
        // Comparing str1 and str2 substrings
        System.out.print(
            "Result of comparing String 1 and String 2 : ");
        System.out.println(
            str1.regionMatches(true, 0, str2, 0, 8));
        // Comparing str1 and str3 substrings
        System.out.print(
            "Result of comparing String 1 and String 3 : ");
        System.out.println(
            str1.regionMatches(false, 0, str3, 0, 8));
        // Comparing str2 and str3 substrings
        System.out.print(
            "Result of comparing String 2 and String 3 : ");
        System.out.println(
            str2.regionMatches(true, 0, str3, 0, 8));


        // Java String replace() Method
        myStr = "Hello";
        System.out.println(myStr.replace('l', 'p'));


        // Java String replaceFirst() Method
        Str = new String("Welcome to Tutorialspoint.com");
        System.out.print("Return Value :" );
        System.out.println(Str.replaceFirst("(.*)Tutorials(.*)", "AMROOD"));
        System.out.print("Return Value :" );
        System.out.println(Str.replaceFirst("Tutorials", "AMROOD"));


        // Java String replaceAll() Method
        Str = new String("Welcome to Tutorialspoint.com");
        System.out.print("Return Value :" );
        System.out.println(Str.replaceAll("(.*)Tutorials(.*)", "AMROOD"));


        // Java String split() Method
        // Custom input string
        str = "geekss@for@geekss";
        String[] arrOfStr = str.split("@", 2);
        for (String a : arrOfStr)
            System.out.println(a);


        // Java String startsWith() Method
        myStr = "Hello";
        System.out.println(myStr.startsWith("Hel"));   // true
        System.out.println(myStr.startsWith("llo"));   // false
        System.out.println(myStr.startsWith("o"));     // false


        // Java String subSequence() Method
        Str = "Welcome to geeksforgeeks";
        // prints the subsequence from 0-7, exclusive 7th index
        System.out.print("Returns: ");
        System.out.println(Str.subSequence(0, 7));
        System.out.print("Returns: ");
        System.out.println(Str.subSequence(10, 24));


        // Java String substring() Method
        // Initializing String
        Str = new String("Welcome to geeksforgeeks");
        // using substring() to extract substring
        // returns (whiteSpace)geeksforgeeks
        System.out.print("The extracted substring is : ");
        System.out.println(Str.substring(10));


        // Java String toCharArray() Method
        // Initializing String
        String s = "GeeksForGeeks";
        char[] gfg1 = s.toCharArray();
        System.out.println(gfg1);


        // Java String toLowerCase() Method
        // Initializing String
        txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());


        // Java String toString() Method
        // Initializing String
        String Strobj = new String("Welcome to the world of geeks.");
        System.out.print("Output String Value :");
        System.out.println(Strobj.toString());
        String Strobj2 = new String("Let's make it simple for you.");
        System.out.print("Output String Value :");
        System.out.println(Strobj2.toString());
        Strobj = new String("THank You");
        System.out.print("Output : ");
        System.out.println(Strobj.toString());


        // Java String toUpperCase() Method
        txt = "Hello World";
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());


        // Java String trim() Method
        myStr = "       Hello World!       ";
        System.out.println(myStr);
        System.out.println(myStr.trim());


        // Java String valueOf() Method
        double d = 102939939.939;
        boolean b2 = true;
        long l = 1232874;
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f','g' };
        System.out.println("Return Value : " + String.valueOf(d) );
        System.out.println("Return Value : " + String.valueOf(b2) );
        System.out.println("Return Value : " + String.valueOf(l) );
        System.out.println("Return Value : " + String.valueOf(arr) );


	}
}
