package demo.w3school.string;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringConcatenation {


	 public static void main(String args[]){

		 // In Java, String concatenation forms a new String that is the combination of multiple strings. There are two ways to concatenate strings in Java:

		   // 1) String Concatenation by + (String concatenation) operator
		   String s="Sachin"+" Tendulkar";
		   System.out.println(s);//Sachin Tendulkar

		   // 2) String Concatenation by concat() method
		   String s1="Sachin ";
		   String s2="Tendulkar";
		   String s3=s1.concat(s2);
		   System.out.println(s3);//Sachin Tendulkar

		// There are some other possible ways to concatenate Strings in Java,

		   // 1. String concatenation using StringBuilder class
		   StringBuilder s4 = new StringBuilder("Hello");    //String 1
		   StringBuilder s5 = new StringBuilder(" World");    //String 2
		   StringBuilder s6 = s4.append(s5);   //String 3 to store the result
		   System.out.println(s6.toString());  //Displays result

		   // 2. String concatenation using format() method
		   s1 = new String("Hello");    //String 1
	       s2 = new String(" World");    //String 2
	       s = String.format("%s%s",s1,s2);   //String 3 to store the result
	       System.out.println(s.toString());  //Displays result

	       // 3. String concatenation using String.join() method (Java Version 8+)
	       s1 = new String("Hello");    //String 1
	       s2 = new String(" World");    //String 2
	       s = String.join("",s1,s2);   //String 3 to store the result
	            System.out.println(s.toString());  //Displays result

	       // 4. String concatenation using StringJoiner class (Java Version 8+)
            StringJoiner ss = new StringJoiner(", ");   //StringeJoiner object
            ss.add("Hello");    //String 1
            ss.add("World");    //String 2
            System.out.println(ss.toString());  //Displays result

            // 5. String concatenation using Collectors.joining() method (Java (Java Version 8+)
            List<String> liststr = Arrays.asList("abc", "pqr", "xyz"); //List of String array
            String str = liststr.stream().collect(Collectors.joining(", ")); //performs joining operation
            System.out.println(str.toString());  //Displays result
	 }
}
