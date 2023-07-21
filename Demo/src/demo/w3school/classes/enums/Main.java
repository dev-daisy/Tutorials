package demo.w3school.classes.enums;

// Enums
// An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables).

// To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma.
// Note that they should be in uppercase letters:

// enum outside class
enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
}

public class Main {

	// enum inside class
	enum Level2 {
	    LOW,
	    MEDIUM,
	    HIGH
	}

	public static void main(String[] args) {

		  Level myVar = Level.MEDIUM;
		  System.out.println(myVar);

		  Level2 myVar2 = Level2.HIGH;
		  System.out.println(myVar2);

		  // Enum in a Switch Statement
		  switch(myVar) {
		      case LOW:
		        System.out.println("Low level");
		        break;
		      case MEDIUM:
		         System.out.println("Medium level");
		        break;
		      case HIGH:
		        System.out.println("High level");
		        break;
		  }

		  // Loop Through an Enum
		  for (Level myVar3 : Level.values()) {
			  System.out.println(myVar3);
		  }
	 }
}