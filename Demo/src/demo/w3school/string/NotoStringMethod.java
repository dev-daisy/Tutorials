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
	   NotoStringMethod s1=new NotoStringMethod(101,"Raj","lucknow");
	   NotoStringMethod s2=new NotoStringMethod(102,"Vijay","ghaziabad");

	   System.out.println(s1);//compiler writes here s1.toString()
	   System.out.println(s2);//compiler writes here s2.toString()
	 }
}
