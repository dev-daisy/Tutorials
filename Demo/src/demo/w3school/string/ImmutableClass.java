package demo.w3school.string;

public class ImmutableClass {

	public static void main(String args[]){

	    // Example to create Immutable class
		Employee e = new Employee("ABC123");
		String s1 = e.getPancardNumber();
		System.out.println("Pancard Number: " + s1);
	}
}
