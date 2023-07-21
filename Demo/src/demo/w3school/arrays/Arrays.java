package demo.w3school.arrays;

public class Arrays {

	// Java Arrays
	// Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
	// To declare an array, define the variable type with square brackets:


	// Advantages
	// Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
	// Random access: We can get any data located at an index position.

	// Disadvantages
	// Size Limit: We can store only the fixed size of elements in the array.
	// It doesn't grow its size at runtime.
	// To solve this problem, collection framework is used in Java which grows automatically.

	//creating a method which receives an array as a parameter
	static void min(int arr[]){
	int min=arr[0];
	for(int i=1;i<arr.length;i++)
		if(min>arr[i])
			min=arr[i];

	  	System.out.println(min);
	}

	//creating a method which receives an array as a parameter
	static void printArray(int arr[]){
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

	//creating method which returns an array
	static int[] get(){
	return new int[]{10,30,50,90,60};
	}

	public static void main(String[] args) {

		//-------------------------------------------------------------
		// Single Dimensional Array in Java
		int a[]=new int[5];//declaration and instantiation
		a[0]=10;//initialization
		a[1]=20;
		a[2]=70;
		a[3]=40;
		a[4]=50;
		//traversing array
		for(int i=0;i<a.length;i++)//length is the property of array
		System.out.println(a[i]);

		// For-each Loop for Java Array
		int arr[]={33,3,4,5};
		//printing array using for-each loop
		for(int i:arr)
		System.out.println(i);


		// Passing Array to a Method in Java
		int b[]={33,3,4,5};//declaring and initializing an array
		min(b);//passing array to method


		// Anonymous Array in Java
		printArray(new int[]{10,22,44,66});//passing anonymous array to method


		// Returning Array from the Method
		//calling method which returns an array
		int arr1[]=get();
		//printing the values of an array
		for(int i=0;i<arr.length;i++)
		System.out.println(arr1[i]);


		// ArrayIndexOutOfBoundsException
		int arr2[]={50,60,70,80};
		//for(int i=0;i<=arr2.length;i++){
		//	System.out.println(arr2[i]);
		//}


		//-------------------------------------------------------------------------

		// Multidimensional Array in Java
		//declaring and initializing 2D array
		int arr3[][]={{1,2,3},{2,4,5},{4,4,5}};
		//printing 2D array
		for(int i=0;i<3;i++){
			 for(int j=0;j<3;j++){
				 System.out.print(arr3[i][j]+" ");
			 }
			 System.out.println();
		}

		// Jagged Array in Java
		 //declaring a 2D array with odd columns
        int arr4[][] = new int[3][];
        arr4[0] = new int[3];
        arr4[1] = new int[4];
        arr4[2] = new int[2];
        //initializing a jagged array
        int count = 0;
        for (int i=0; i<arr4.length; i++)
            for(int j=0; j<arr4[i].length; j++)
                arr4[i][j] = count++;

        //printing the data of a jagged array
        for (int i=0; i<arr4.length; i++){
            for (int j=0; j<arr4[i].length; j++){
                System.out.print(arr4[i][j]+" ");
            }
            System.out.println();//new line
        }


        // What is the class name of Java array?
        // In Java, an array is an object. For array object, a proxy class is created whose name can be obtained by getClass().getName() method on the object
        //declaration and initialization of array
        int arr6[]={4,4,5};
        //getting the class name of Java array
        Class c=arr6.getClass();
        String name=c.getName();
        //printing the class name of Java array
        System.out.println(name);

        // Copying a Java Array
        //declaring a source array
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd' };
        //declaring a destination array
        char[] copyTo = new char[7];
        //copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        //printing the destination array
        System.out.println(String.valueOf(copyTo));

        // Cloning an Array in Java
        int arr7[]={33,3,4,5};
        System.out.println("Printing original array:");
        for(int i:arr7)
        System.out.println(i);

        System.out.println("Printing clone of the array:");
        int carr[]=arr7.clone();
        for(int i:carr)
        System.out.println(i);

        System.out.println("Are both equal?");
        System.out.println(arr7==carr);


        // Multiplication of 2 Matrices in Java
        //creating two matrices
        int a6[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b6[][]={{1,1,1},{2,2,2},{3,3,3}};

        //creating another matrix to store the multiplication of two matrices
        int c6[][]=new int[3][3];  //3 rows and 3 columns

        //multiplying and printing multiplication of 2 matrices
        for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
        c6[i][j]=0;
        for(int k=0;k<3;k++)
        {
        c6[i][j]+=a6[i][k]*b6[k][j];
        }//end of k loop
        System.out.print(c6[i][j]+" ");  //printing matrix element
        }//end of j loop
        System.out.println();//new line
        }
	}

}
