package demo.w3school.serialization;

import java.io.Serializable;

// Java Serialization with the static data member
class Employee  implements Serializable{

	// SerialVersionUID
	// The serialization process at runtime associates an id with each Serializable class which is known as SerialVersionUID.
	// It is used to verify the sender and receiver of the serialized object. The sender and receiver must be the same.
	// To verify it, SerialVersionUID is used. The sender and receiver must have the same SerialVersionUID, otherwise,
	// InvalidClassException will be thrown when you deserialize the object.
	// We can also declare our own SerialVersionUID in the Serializable class.
	// To do so, you need to create a field SerialVersionUID and assign a value to it.
	// It must be of the long type with static and final.
	// It is suggested to explicitly declare the serialVersionUID field in the class and have it private also. For example:
	private static final long serialVersionUID=1L;

	// Java Transient Keyword
	// If you don't want to serialize any data member of a class, you can mark it as transient.
	 transient int id;



	 String name;
	 static String company="SSS IT Pvt Ltd";//it won't be serialized
	 public Employee(int id, String name) {
	  this.id = id;
	  this.name = name;
	 }
}
