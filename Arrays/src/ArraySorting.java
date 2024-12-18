import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] subjectMarks = {99,55,88,77,66,44};
		System.out.println("Original Array: " + Arrays.toString(subjectMarks));
		Arrays.sort(subjectMarks);
		System.out.println("Sorted Ascending Array: " + Arrays.toString(subjectMarks));
	}

}
