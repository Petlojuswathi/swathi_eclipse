package exceptions;

public class MultipleTestingBlocks {
	public static void main(String[] args) {
		System.out.println("Start");
		
		int[] arr = {10,20,30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		String s = null;
		
		try {
			//System.out.println(arr[3]);
			//System.out.println(10/0);
			System.out.println(s.charAt(0));
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No Element found");
		} catch(ArithmeticException e) {
			System.out.println("can't divide by 0");
		} catch(Exception e) {
			e.printStackTrace();
			//System.out.println(e);
			//System.out.println(e.getMessage());
		}
		System.out.println("The End");
	}
}
