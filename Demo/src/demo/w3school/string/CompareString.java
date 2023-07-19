package demo.w3school.string;

public class CompareString {
	public static void main(String args[]){

		// By Using equals() Method
  		   // Two strings are compared using equals() method of String class.
		   // And the result is printed as boolean values, true or false.
		   String s1="Sachin";
		   String s2="Sachin";
		   String s3=new String("Sachin");
		   String s4="Saurav";
		   System.out.println(s1.equals(s2));//true
		   System.out.println(s1.equals(s3));//true
		   System.out.println(s1.equals(s4));//false

		   // The methods of String class are used.
		   // The equals() method returns true if String objects are matching and both strings are of same case. equalsIgnoreCase() returns true regardless of cases of strings.
		   s1="Sachin";
		   s2="SACHIN";
		   System.out.println(s1.equals(s2));//false
		   System.out.println(s1.equalsIgnoreCase(s2));//true

	   // By Using == operator
		   // demonstrates the use of == operator used for comparing two String objects.
		   s1="Sachin";
		   s2="Sachin";
		   s3=new String("Sachin");
		   System.out.println(s1==s2);//true (because both refer to same instance)
		   System.out.println(s1==s3);//false(because s3 refers to instance created in nonpool)

	   // By Using compareTo() method
		   s1="Sachin";
		   s2="Sachin";
		   s3="Ratan";
		   System.out.println(s1.compareTo(s2));//0
		   System.out.println(s1.compareTo(s3));//1(because s1>s3)
		   System.out.println(s3.compareTo(s1));//-1(because s3 < s1 )

	}
}
