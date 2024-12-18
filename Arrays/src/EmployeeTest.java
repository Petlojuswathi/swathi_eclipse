
public class EmployeeTest {

	public static void main(String[] args) {
		//Object Creation Or Instantiation
		Employee e1 = new Employee(1001, "Krish", 45000.0);
		
		//Acessing Static props
		System.out.println(e1.employeeId);
		System.out.println(e1.employeeName);
		System.out.println(e1.employeeSalary);
		
		//Acessing Static props
		System.out.println(e1.employeeOrganisation);

		//Acessing Class name is recommended
		System.out.println(Employee.employeeOrganisation);
		
		//Acessing Instance Method
		e1.displayDetails();
	}

}
