package demo.w3school.string;

class NotoStringMethod {
	int rollno;
	 String name;
	 String city;

	 NotoStringMethod(int rollno, String name, String city){
		 this.rollno=rollno;
		 this.name=name;
		 this.city=city;
	 }

	 public static void main(String args[]){
	   NotoStringMethod s1=new NotoStringMethod(101,"Hello"," World!");
	   NotoStringMethod s2=new NotoStringMethod(102,"Hi!"," How are you?");

	   System.out.println(s1);//compiler writes here s1.toString()
	   System.out.println(s2);//compiler writes here s2.toString()
	 }
}
