package demo.w3school.serialization;


/*
 *
Example of Java Deserialization
Deserialization is the process of reconstructing the object from the serialized state.
It is the reverse operation of serialization. Let's see an example where we are reading the data from a deserialized object.

Deserialization is the process of reconstructing the object from the serialized state.
It is the reverse operation of serialization. Let's see an example where we are reading the data from a deserialized object.
 *
 */

import java.io.FileInputStream;
import java.io.ObjectInputStream;

class Depersist{
	 public static void main(String args[]){
		  try{
			  //Creating stream to read the object
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
			  Student s=(Student)in.readObject();
			  //printing the data of the serialized object
			  System.out.println(s.id+" "+s.name);
			  //closing the stream
			  in.close();
		  }catch(Exception e){System.out.println(e);}
	 }
}
