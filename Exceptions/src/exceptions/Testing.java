package exceptions;

public class Testing {

	public static void main(String[] args) {
		int[] arr = {10,20,30};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		try {
			System.out.println(arr[3]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No Element found");
		}
	}
}
