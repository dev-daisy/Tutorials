package demo.w3school.serialization;

import java.io.Serializable;
class Person implements Serializable{
	 int id;
	 String name;

	 // Java Serialization with Aggregation (HAS-A Relationship)
	 // If a class has a reference to another class, all the references must be Serializable
	 // otherwise serialization process will not be performed.
	 // In such case, NotSerializableException is thrown at runtime.
	 // Since Address is not Serializable, you cannot serialize the instance of the Person class.
	 Address address;//HAS-A

	 Person(int id, String name) {
		  this.id = id;
		  this.name = name;
	 }
}
