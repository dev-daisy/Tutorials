package demo.linkedinlearning.advancejava.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class ParameterWildCard {

	//? field1;        // invalid
	static List<?> field1;  // valid

    public static void main(String[] args)
    {
    	field1 = Arrays.asList(4, 5, 6, 7);
    	method2(field1);
    	System.out.println(field1);

    	field1 =  method2(Arrays.asList("test1", "test2"));
    	System.out.println(field1);

    	field1 =  method2(Arrays.asList(true, false));
    	System.out.println(field1);

    	field1 =  method2(Arrays.asList("test", false, 1, 1.3));
    	System.out.println(field1);

    	method3();
    }


    //private ? method1(? param) {return param;}              // invalid
    private static List<?> method2(List<?> param) {return param;}  // valid

    private static void method3() {
        //? var1;        // invalid
        List<?> var2;  // valid
        var2= Arrays.asList("test1", "test2");
    	System.out.println(var2);
    }

    // Upper bound wildcard - use extends
    public static void copy(List<? extends Number> dest, List<? extends Number> src){}

    // Lower bound wildcard - use super
    public void print(List<? super Integer> list){

    }

}
