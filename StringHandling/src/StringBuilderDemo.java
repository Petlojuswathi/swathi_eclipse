/*
 StringBuffer is mutable 
 Not thread safe objecr
 */

public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Java");
		System.out.println(sb);b.append("23");
		System.out.println(sb);
		
		StringBuilder sb1 = sb.reverse();
		System.out.println(sb);
		
	}

}
