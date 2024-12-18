
public class Student {
	//Instance Variables memory allocation for each and every object
	int studentId;
	String studentName;
	double studentGPA;
	
	//Static Variables
	static String batchCode = "2024-12980";
	
	//constructor
	public Student(int studentId, String studentName, double studentGPA) {
		System.out.println("constructor"); //to perform initialaization of instance variables
		this.studentId = studentId;	
		this.studentName = studentName;
		this.studentGPA = studentGPA;
	}
	
	//Instance Methods
	public void displayStudentDetails() {
		System.out.println("ID:"+studentId);
		System.out.println("Name: "+studentName);
		System.out.println("GPA: "+studentGPA);
		System.out.println("BatchCode: "+batchCode);
	}
}