
import java.util.Arrays;

public class ArraySorting1 {
    public static void main(String[] args) {
        // Original array
        int[] subjectMarks = {5, 3, 8, 6, 2, 7, 4, 1};
        
        // Print the original array
        System.out.println("Original Array: " + Arrays.toString(subjectMarks));
        
        // Sort the array in ascending order
        Arrays.sort(subjectMarks);
        
        // Reverse the array to make it descending
        int[] descendingNumbers = new int[subjectMarks.length];
        for (int i = 0; i < subjectMarks.length; i++) {
            descendingNumbers[i] = subjectMarks[subjectMarks.length - 1 - i];	`
        }
        
        // Print the sorted array in descending order
        System.out.println("Sorted Array in Descending Order: " + Arrays.toString(subjectMarks));
    }
}


