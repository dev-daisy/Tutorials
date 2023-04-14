package demo.developmentbasics.classes;

// Use classes to prevent code reuse and the primary use of a class is to create an object out of the class
// And that gives us a lot of power in terms of object-oriented programming
public class Employee {

	private int employeeNum = 5;
	private String employeeName;

	public Employee(){
		this.employeeName = "default";
	}

	public void setEmployeeNum(int n){
		this.employeeNum = n;
	}

}
