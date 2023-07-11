package demo.developmentbasics.modifiers;

public class StringReverser {

	public static String reverser(String s){
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		return sb.reverse().toString();
	}
}
