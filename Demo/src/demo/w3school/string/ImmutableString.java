package demo.w3school.string;

public class ImmutableString {

	public static void main(String args[]){

		// Here Sachin is not changed but a new object is created with Sachin Tendulkar.
	   String s="Sachin";
	   s.concat(" Tendulkar");//concat() method appends the string at the end
	   System.out.println(s);//will print Sachin because strings are immutable objects

	   // Explicitly assign it to the reference variable, it will refer to "Sachin Tendulkar" object.
	   s="Sachin";
	   s=s.concat(" Tendulkar");
	   System.out.println(s);

	}
}
