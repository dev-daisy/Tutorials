package demo.w3school.string;

class WithtoStringMethod {
	 int rollno;
	 String name;
	 String city;

	 WithtoStringMethod(int rollno, String name, String city){
		 this.rollno=rollno;
		 this.name=name;
		 this.city=city;
	 }

	 public String toString(){//overriding the toString() method
		 return rollno+" "+name+" "+city;
	 }

	 public static void main(String args[]){
		 WithtoStringMethod s1=new WithtoStringMethod(101,"Hello"," World");
		 WithtoStringMethod s2=new WithtoStringMethod(102,"Hi! ","Welcome.");

	   System.out.println(s1);//compiler writes here s1.toString()
	   System.out.println(s2);//compiler writes here s2.toString()
	 }
}
