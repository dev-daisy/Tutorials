package demo.w3school.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

// Serialization and Deserialization in Java
/*
 *
Serialization in Java is a mechanism of writing the state of an object into a byte-stream.
It is mainly used in Hibernate, RMI, JPA, EJB and JMS technologies.

The reverse operation of serialization is called deserialization where byte-stream is converted into an object.
The serialization and deserialization process is platform-independent,
it means you can serialize an object on one platform and deserialize it on a different platform.

For serializing the object, we call the writeObject() method of ObjectOutputStream class,
and for deserialization we call the readObject() method of ObjectInputStream class.

We must have to implement the Serializable interface for serializing the object.

Advantages of Java Serialization
It is mainly used to travel object's state on the network (that is known as marshalling).

java.io.Serializable interface
Serializable is a marker interface (has no data member and method). It is used to "mark" Java classes so that the objects of these classes may get a certain capability. The Cloneable and Remote are also marker interfaces.

The Serializable interface must be implemented by the class whose object needs to be persisted.

The String class and all the wrapper classes implement the java.io.Serializable interface by default.

bjectOutputStream class
The ObjectOutputStream class is used to write primitive data types, and Java objects to an OutputStream.
Only objects that support the java.io.Serializable interface can be written to streams.

Constructor
1) public ObjectOutputStream(OutputStream out) throws IOException {}
It creates an ObjectOutputStream that writes to the specified OutputStream.





 *
 */
class Persist {
	public static void main(String args[]){
		  try{
			  //Creating the object
			  Student s1 =new Student(211,"ravi");
			  //Creating stream and writing the object
			  FileOutputStream fout=new FileOutputStream("f.txt");
			  ObjectOutputStream out=new ObjectOutputStream(fout);
			  out.writeObject(s1);
			  out.flush();
			  //closing the stream
			  out.close();
			  System.out.println("success");
		  }catch(Exception e){System.out.println(e);}
	 }
}
