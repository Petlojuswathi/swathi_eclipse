package Java8features;

import java.util.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipeLineDemo {
	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(50000, 40000, 20000, 30000, 60000);
		System.out.println(salaries);

		/*TASK-1
		 * 1. Filter the salaries which are >= 50000 
		 * 2. Increment the filtered salaries by 10% //55000+66000
		 *  3. Find the total of filtered and incremented salaries// 1,21,000
		 *  solve by one logic
		 */
		salaries.stream()
		.filter((salary) -> salary >= 50000)
		.forEach(System.out :: println);
		

		double totalSalary = salaries.stream()
                .filter((salary) -> salary >= 50000)//intermediate operation 1 
				.map((salary)-> salary + (salary * 0.1))//intermediate operation 2
				.mapToDouble(salary -> salary)//intermediate operation 3
				.sum();//Terminal Operation
       System.out.println(totalSalary);
       
       
        /*  TASK-2
		 * 1. Filter the salaries which are <= 50000 
		 * 2. Increment the filtered salaries by 20% //55000+66000
		 * 3. Sort the incremented salaries in descending order
		 */
       
       List<Integer> incrementedSalaries = salaries.stream()//source
    	
    		   .filter(salary -> salary <= 50000) //intermediate operation 1 
    		   .sorted(Comparator.reverseOrder())  //intermediate operation 1 
    		   .toList(); 
       
      System.out.println(incrementedSalaries);
	
      
      /*TASK-3
       * Input: [1,3,2,4,3,1,2]
       * output: [4,3,2,1]
       */
      
      List<Integer> nums = Arrays.asList(1, 3, 2, 4, 3, 1, 2);
    		  List<Integer> uniqueNums = nums.stream()
              .distinct()  // Remove duplicates
              .sorted(Comparator.reverseOrder())  // Sort in descending order
              .toList();  // Collect into a list
      System.out.println(uniqueNums);
      
      /* TASK-4
       * Input : JAVA
       * Output : J A V A
       */
      String input = "JAVA";
      String spacedOutput = input.chars()  
              .mapToObj(c -> String.valueOf((char) c)) 
              .collect(Collectors.joining(" "));  
      System.out.println("Spaced String: " + spacedOutput);
      
      /*TASK-5
       * Input: ["ja va", "py thon", "an gu lar"]
       * Output: ["JAVA","PYTHON","ANGULAR"]
       */
      List<String> phrases = Arrays.asList("ja va", "py thon", "an gu lar");
      List<String> cleanedPhrases = phrases.stream()
              .map(phrase -> phrase.replaceAll("\\s", "").toUpperCase())  // Remove spaces and convert to uppercase
              .collect(Collectors.toList());  // Collect into a list
      System.out.println(cleanedPhrases);
      
     }
}