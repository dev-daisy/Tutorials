package demo.w3school.string;

public class StringBuffers {

	public static void main(String args[]){

		// 1) StringBuffer Class append() Method
		StringBuffer sb=new StringBuffer("Hello ");
		sb.append("Java");//now original string is changed
		System.out.println(sb);//prints Hello Java

		// 2) StringBuffer insert() Method
		sb=new StringBuffer("Hello ");
		sb.insert(1,"Java");//now original string is changed
		System.out.println(sb);//prints HJavaello

		// 3) StringBuffer replace() Method
		sb=new StringBuffer("Hello ");
		sb.replace(1,3,"Java");
		System.out.println(sb);//prints HJavalo

		// 4) StringBuffer delete() Method
		sb=new StringBuffer("Hello ");
		sb.delete(1,3);
		System.out.println(sb);//prints Hlo

		// 5) StringBuffer reverse() Method
		sb=new StringBuffer("Hello ");
		sb.reverse();
		System.out.println(sb);//prints olleH

		// 6) StringBuffer capacity() Method
		sb=new StringBuffer("Hello ");
		System.out.println(sb.capacity());//default 16
		sb.append("Hello");
		System.out.println(sb.capacity());//now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

		// 7) StringBuffer ensureCapacity() method
		sb=new StringBuffer("Hello ");
		System.out.println(sb.capacity());//now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb.ensureCapacity(10);//now no change
		System.out.println(sb.capacity());//now 34
		sb.ensureCapacity(50);//now (34*2)+2
		System.out.println(sb.capacity());//now 70



	}
}
