/*
 Array Defination:
 -----------------
 To Represent a goup fixed size of similar data elements
 */
public class ArraysDemo {

	public static void main(String[] args) {
		//1.Array Declaration
		int[] arr1; //recommend syntax
		int []arr2;
		int arr3[];
		//int[10] arr;// compliation error
		
		//2.Array Creation
		arr1 = new int[10]; //size is mandatory 
		//arr1 = new int[]; //if not specify it gives compliation error
		//arr3 = new int[-10];//Runtime Error
		arr2 = new int[0];
		
		//3.Array Initialization
		arr1[0] = 44;
		arr1[1] = 55;
		arr1[2] = 66;
		
		//4.Acess Array Elements
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[9]);
		//System.out.println(arr1[10]);//RE
		
		//Array Declaration, Creation and Initialaization at a time
		int[] arr4 = new int[] {44,55,66,77,88,99};
		
		int[] arr5 = {44,55,66,77,88,99};
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		System.out.println(arr4[3]);
		System.out.println(arr4[4]);
		System.out.println(arr4[5]);
		
		//find size of array
		System.out.println(arr4.length);
		
		//Array Traversal
		double[] salaries = {55000.0, 45000.0, 35000.0, 25000.0};
		System.out.println("Using for loop");
		for(int index=0; index < salaries.length; index++) {
			System.out.println(salaries[index]); 
			
		/*int size = salaries.length	
		for(int index=0; index < size; index++) {
			System.out.println(salaries[index]); 
		 */
		}
		System.out.println("Using Foreach loop from V1.5");
		for(double salary : salaries) {
			System.out.println(salary);
		}
		
		/*
		 store the following employee names
		 1.Wills,Smith,Jones,Alex
		 2.Display all employee using for loop and for each loop
		 */
		
		String[] employees = {"Wills", "Smith", "Jones", "Alex"};
		System.out.println("Using for loop");
		int length = employees.length;
		for(int index=0; index < length; index++) {
			System.out.println(employees[index]); }
			
		System.out.println("Using Foreach loop");
		for(String names : employees) {
			System.out.println(names);
		}
		
		int[] subjectMarks = {55,44,99,77,88,66};
		//Total Subject Marks
		//Average of Subject MArks
		int sum=0;
		for(int marks : subjectMarks) {
			sum += marks;
		}
		System.out.println("Total subject marks="+sum);
		System.out.println("Average subject marks="+(sum/subjectMarks.length));
		
		//Program to find minimum,maximum ele in an array
		// min ele in an array
		int min = subjectMarks[0];
		for(int marks : subjectMarks) {
		if(min > marks) {
		min = marks;
		}
		}
		System.out.println("Minimum marks : "+min);

		// max ele in an array
		int max = subjectMarks[0];
		for(int marks : subjectMarks) {
		if(max < marks) {
		max = marks;
		}
		}
		System.out.println("Maximum marks = "+max);

		// searching an ele
		int search = 99;
		for(int i=0; i<subjectMarks.length; i++) {
		if(subjectMarks[i] == search) {
		System.out.println("Element found at "+i);
		System.exit(0);
		}
		}
		System.out.println("Element not found");
	}
}
	
