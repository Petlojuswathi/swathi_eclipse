
public class MethodsDemo2 {
	public static int findsum(int x,int y) {
		return x + y;
	}
	
	public static void greet() {
		System.out.println("Welcome All");
	}
	
	public static void main(String[] args) {
		int total = findsum(10,20);
		System.out.println(total);
		
		greet();

	}

}
