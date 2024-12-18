import java.util.Scanner;

public class MyAtmApp {
	static double balance = 5000.0;
	static int originalPin = 1234;

	public static boolean authenticat(int pin) {
		if(pin == originalPin) {
			return true;
		} 
		return false;
	}
	
	public static void main(String[] args) {
		int pin = 0;
		Scanner in = new Scanner(System.in);
		int option = 0;
		do {
			System.out.println("ATM APPLICATION");
			System.out.println("-------------------");
			System.out.println("1. Balance Check");
			System.out.println("2. Deposit Amount");
			System.out.println("3. Withdraw Amount");
		}
		switch (option) {
		case 1:
			System.out.println("Please enter pin: ");
			int pin = in.nextInt();
			
			if(authenticate(pin)) {
				System.out.println("Balance:"+balance);
			}else {
				System.out.println("Invalid Pin");
			}
			break;
			
		case 2:
			System.out.println("Please enter pin: ");
			int pin = in.nextInt();
			
			if(authenticate(pin)) {
				System.out.println("Please enter deposit amount:");
				double depositAmount = in.nextDouble();
				balance = balance + deposit 
			break;
			
		case 3:
			System.out.println("Please enter pin: ");
			int pin = in.nextInt();
			
			if(authenticate(pin)) {
				System.out.println("Balance:"+balance);
			}else {
				System.out.println("Invalid Pin");
			}
			System.out.println("Please enter Withdraw amount: ");
			double withdrawAmount = in.nextDouble();
			break;
		case 0:
			System.out.println("Thankyou for using ATM");
			System.out.println("Have a good day");
			System.exit(0); //terminate jvm
			break;
		}

	}

}
