package demo.linkedinlearning.advancejava.generics.wildcards;

// Java program to demonstrate Upper Bounded Wildcards
// These wildcards can be used when you want to relax the restrictions on a variable.

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {


	// Wildcards support both upper and lower bounds,
	// type parameters just support upper bounds.

	public static void main(String[] args)
    {

        // Upper Bounded Integer List
		// collection of Integer
        List<Integer> list1 = Arrays.asList(4, 5, 6, 7);

        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(list1));

        // Double list
        // collection of Double
        List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);

        // printing the sum of elements in list
        System.out.print("Total sum is:" + sum(list2));
    }

	// wildcard that extends Number
	// means that list being passed can be of any field or subclass of that field.
	// Integer and Double are subclasses of class Number.
    private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }

        return sum;
    }


}
