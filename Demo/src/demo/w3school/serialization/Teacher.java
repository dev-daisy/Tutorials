package demo.w3school.serialization;

class Teacher extends Person{
	 String course;
	 int fee;
	 public Teacher(int id, String name, String course, int fee) {
		  super(id,name);
		  this.course=course;
		  this.fee=fee;
	 }
}
