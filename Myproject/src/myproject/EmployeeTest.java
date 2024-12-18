package myproject;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"krish",55000,"krish@gmail.com");
		System.out.println(e1);
		
		Employee e2 = new Employee();
		e2.setEmployeeId(101);
		e2.setEmployeeName("krish");
		e2.setEmployeeSalary(55000);
		e2.setEmployeeEmail("krish@gmail.com");
		
		System.out.println(e2.getEmployeeId());
		System.out.println(e2.getEmployeeName());
		System.out.println(e2.getEmployeeSalary());
		System.out.println(e2.getEmployeeEmail());

	}

}
