
public class EmployeeTest1 {

	public static void main(String[] args) {
		EncapsulationEmployee e1 = new EncapsulationEmployee();
		e1.setEmployeeId(1001);
		e1.setEmployeeName("Krish");
		e1.setEmployeeSalary(55000.0);
		
		EmployeeService es = new EmployeeService();
		es.addEmployee(0, e1);
		EncapsulationEmployee = es.getEmployee(0);
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
		System.out.println(employee.getEmployeeSalary());
	}

}