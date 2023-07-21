package demo.w3school.classes.abstraction.interfaces;

class NestedInterface implements Printable.MessagePrintable{
	 public void msg(){System.out.println("Hello nested interface");}

	 public static void main(String args[]){
		 Printable.MessagePrintable message=new NestedInterface();//upcasting here
	  message.msg();
	 }

}
