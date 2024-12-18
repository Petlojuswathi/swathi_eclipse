package exceptions;

public class CheckedExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Hello");
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			System.out.println("Exception raised!");
		}
		System.out.println("Java");
	}

}
