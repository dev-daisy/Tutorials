package demo.linkedinlearning.java11;

public class Exercise3 {

	public static void main(String[] args) {

		// 2 instances of Ex3StudentProfile
		Ex3StudentProfile profileOne = new Ex3StudentProfile("Sally", "Salmon", "Film", 3.75, 2022);
		Ex3StudentProfile profileTwo = new Ex3StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);

		// an instance function
        profileTwo.incrementExpectedGraduationYear();


        // print the value of an instance variable
        System.out.println(profileTwo.expectedYearToGraduate);
    }
}
