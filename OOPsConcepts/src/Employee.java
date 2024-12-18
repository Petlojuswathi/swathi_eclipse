
public class Employee {
	//Instance props
	int employeeId;
	String employeeName;
	double employeeSalary;
	
	//static props
	static String employeeOrganisation = "Edubridge";
	
	//Constructor
	//To perform initialization of newly created objects
	public Employee(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName =employeeName;
		this.employeeSalary = employeeSalary;
		
	}
	//Instance Method
	public void displayDetails() {
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Salary: "+employeeSalary);
	}

}
