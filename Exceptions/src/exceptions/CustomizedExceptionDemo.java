package exceptions;

public class CustomizedExceptionDemo {
	static int balance = 5000;
	
	public static void checkAge(int age) throws InvalidAgeException {
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}else {
			throw new InvalidAgeException("No eligible to vote");
		}
	}
	public static void withdraw(int amount) {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient funds");
		}else {
			System.out.println("Collect Cash");
		}
	}
	
	public static void main(String[] args) {
		try {
			checkAge(18);
			//checkAge(12); 
		} catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
			withdraw(5000);
	}

}
