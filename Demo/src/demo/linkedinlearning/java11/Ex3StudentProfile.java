package demo.linkedinlearning.java11;

// class
public class Ex3StudentProfile {

	// attributes or instance variables with data types
	String firstName;
    String lastName;
    String declaredMajor;
    double gpa;
    int expectedYearToGraduate;

    // a constructor
    // each parameters should map back to an attribute
    public Ex3StudentProfile(String firstName, String lastName,
                          String declaredMajor, double gpa, int expectedYearToGraduate) {


    	//use this keyword to access attributes
        this.firstName = firstName;
        this.lastName = lastName;
        this.declaredMajor = declaredMajor;
        this.gpa = gpa;
        this.expectedYearToGraduate = expectedYearToGraduate;
    }


    // behavior or instance method
    // take no parameters
    // a returning void
    // that;s the implementation
    public void incrementExpectedGraduationYear() {

    	//use this keyword to access instance variable
        this.expectedYearToGraduate = this.expectedYearToGraduate + 1;
    }
}
