
public class MethodsDemo {
	public static int findSquare(int n) {
		return n * n;
	}
	public static int findCube(int n) {
		return n * n * n;
	}
	public static void main(String[] args) {
		int n = 20;
		
		int square = findSquare(n);
		int cube = findCube(n);
		
		System.out.println("Square of "+n+" is "+square);
		System.out.println("cube of "+n+" is "+cube);
	}
}
