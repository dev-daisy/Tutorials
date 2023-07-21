package demo.w3school.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/*
 *
Java Serialization with Inheritance (IS-A Relationship)
If a class implements Serializable interface then all its sub classes will also be serializable.
Let's see the example given below:
 *
 */


//Java Serialization with array or collection
//Rule: In case of array or collection, all the objects of array or collection must be serializable.
//If any object is not serialiizable, serialization will be failed.
/*
 *
Externalizable in java
The Externalizable interface provides the facility of writing the state of an object into a byte stream in compress format. It is not a marker interface.

The Externalizable interface provides two methods:

public void writeExternal(ObjectOutput out) throws IOException
public void readExternal(ObjectInput in) throws IOException
Java Transient Keyword
If you don't want to serialize any data member of a class, you can mark it as transient.
 *
 */


public class SerializeISA {
	public static void main(String args[])
	 {
	    try{
	    	//Creating the object
	    	Teacher s1 =new Teacher(211,"ravi","Engineering",50000);
	    	//Creating stream and writing the object
			  FileOutputStream fout=new FileOutputStream("f.txt");
			  ObjectOutputStream out=new ObjectOutputStream(fout);
			  out.writeObject(s1);
			  out.flush();
			  //closing the stream
			  out.close();
			  System.out.println("success");
	    }catch(Exception e){System.out.println(e);}
	    try{
		  //Creating stream to read the object
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
		  Teacher s=(Teacher)in.readObject();
		  //printing the data of the serialized object
		  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);
		  //closing the stream
		  in.close();
	    }catch(Exception e){System.out.println(e);}
	 }
}
