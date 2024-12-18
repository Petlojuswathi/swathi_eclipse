import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter employee id: ");
		int employeeId = in.nextInt();
		System.out.println("Please enter employee name: ");
		String employeeName = in.next();
		
		System.out.println("Please enter employee salary: ");
		double employeeSalary = in.nextDouble();
		
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+employeeSalary);

	}

}
