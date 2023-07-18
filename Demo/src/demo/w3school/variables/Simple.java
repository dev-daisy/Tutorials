package demo.w3school.variables;

public class Simple{
	public static void main(String[] args){

		// Add two numbers
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);

		// Widening
		int a1=10;
		float f=a1;
		System.out.println(a1);
		System.out.println(f);

		// Narrowing (Typecasting)
		float f1=10.5f;
		//int a=f;//Compile time error
		int a2=(int)f1;
		System.out.println(f1);
		System.out.println(a2);

		// Overflow
		int a3=130;
		byte b1=(byte)a3;
		System.out.println(a3);
		System.out.println(b1);

		// Adding Lower Type
		byte a4=10;
		byte b2=10;
		//byte c1=a4+b2;//Compile Time Error: because a+b=20 will be int
		byte c1=(byte)(a4+b2);
		System.out.println(c1);
	}
}