package demo.w3school.string;

public class StringBuilders {

	public static void main(String args[]){

		// 1) StringBuilder append() method
		StringBuilder sb=new StringBuilder("Hello ");
		sb.append("Java");//now original string is changed
		System.out.println(sb);//prints Hello Java


		// 2) StringBuilder insert() method
		 sb=new StringBuilder("Hello ");
		 sb.insert(1,"Java");//now original string is changed
		 System.out.println(sb);//prints HJavaello


		// 3) StringBuilder replace() method
		 sb=new StringBuilder("Hello ");
		 sb.replace(1,3,"Java");
		 System.out.println(sb);//prints HJavalo

		// 4) StringBuilder delete() method
		 sb=new StringBuilder("Hello ");
		 sb.delete(1,3);
		 System.out.println(sb);//prints Hlo


		// 5) StringBuilder reverse() method
		 sb=new StringBuilder("Hello ");
		 sb.reverse();
		 System.out.println(sb);//prints olleH

		// 6) StringBuilder capacity() method
		 sb=new StringBuilder("Hello ");
		 System.out.println(sb.capacity());//now 16
		 sb.append("Java is my favourite language");
		 System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2

		// 7) StringBuilder ensureCapacity() method
		 sb=new StringBuilder("Hello ");
		 System.out.println(sb.capacity());//now 16
		 sb.append("Java is my favourite language");
		 System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
		 sb.ensureCapacity(10);//now no change
		 System.out.println(sb.capacity());//now 34
		 sb.ensureCapacity(50);//now (34*2)+2
		 System.out.println(sb.capacity());//now 70



	}
}
