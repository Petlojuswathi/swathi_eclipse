import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter student id: ");
		int studentId = in.nextInt();
		
		System.out.println("Please enter student name: ");
		String studentName = in.next();
		
		System.out.println("Please enter student email: ");
		String studentEmail = in.next();
		
		System.out.println("Please enter student mobileno: ");
		long studentMobileno = in.nextLong();
		
		System.out.println("Please enter  gpa: ");
		double studentGpa = in.nextDouble();
		
		System.out.println("student Id: "+studentId);
		System.out.println("student Name: "+studentName);
		System.out.println("student Email: "+studentEmail);
		System.out.println("student MobileNo: "+studentMobileno);
		System.out.println("student Gpa: "+studentGpa);

	}

}
