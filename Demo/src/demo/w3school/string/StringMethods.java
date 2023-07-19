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














	}
}
