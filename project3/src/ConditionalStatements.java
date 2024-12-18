
public class ConditionalStatements {
	
	public static boolean isEven(int num) {
		boolean status = false;
		if(num % 2 == 0) {
			status = true;
		}
		return status;
	}
	
	public static boolean isOdd(int num) {
		boolean status = true;
		if(num % 2 == 0) {
			status = false;
		}
		return status;
	}
	
	public static void findEvenOrOdd(int num) {
		if(num % 2 == 0) {
			System.out.println(num+" is even");
		}else {
			System.out.println(num+" is odd");
		
		}
	}
	
	public static void main(String[] args) {
		findEvenOrOdd(10);
		findEvenOrOdd(11);
		findEvenOrOdd(12);
		
		System.out.println(isEven(10));
		System.out.println(isEven(11));
		System.out.println(isEven(12));
		
		System.out.println(isOdd(10));
		System.out.println(isOdd(11));
		System.out.println(isOdd(12));

	}

}
