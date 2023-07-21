package demo.w3school.classes.inheritance;


/*
 *

 If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.
Consider a situation, Employee object contains many informations such as id, name, emailId etc.
It contains one more object named address,
which contains its own informations such as city, state, country, zipcode etc. as given below.

 Why use Aggregation?
 For Code Reusability.

When use Aggregation?
Code reuse is also best achieved by aggregation when there is no is-a relationship.
Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved;
otherwise, aggregation is the best choice.

 *
 */
public class Aggregation {

	 Operation op;//aggregation
	 double pi=3.14;

	 double area(int radius){
	   op=new Operation();
	   int rsquare=op.square(radius);//code reusability (i.e. delegates the method call).
	   return pi*rsquare;
	 }

	 public static void main(String args[]){
	   Aggregation c=new Aggregation();
	   double result=c.area(5);
	   System.out.println(result);
	 }
}
