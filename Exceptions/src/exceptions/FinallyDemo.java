package exceptions;

public class FinallyDemo {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			System.out.println(10/0);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("can't divide by 0");
		} finally {
			System.out.println("Mandatory Code");
		}
		System.out.println("End");
	}

}
