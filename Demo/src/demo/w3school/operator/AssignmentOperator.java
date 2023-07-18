package demo.w3school.operator;

public class AssignmentOperator {
	public static void main(String args[]){
		int a=10;
		int b=20;
		a+=4;//a=a+4 (a=10+4)
		b-=4;//b=b-4 (b=20-4)
		System.out.println(a);
		System.out.println(b);

		a=10;
		a+=3;//10+3
		System.out.println(a);
		a-=4;//13-4
		System.out.println(a);
		a*=2;//9*2
		System.out.println(a);
		a/=2;//18/2
		System.out.println(a);

		// Adding short
		short x=10;
		short y=10;
		//x+=y;//x=x+y internally so fine
		//x=x+y;//Compile time error because 10+10=20 now int
		x=(short) (x+y);
		System.out.println(x);
	}
}
