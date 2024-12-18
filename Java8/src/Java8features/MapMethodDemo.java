package Java8features;

import java.util.Arrays;
import java.util.List;
import 

public class MapMethodDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,45000,25000,35000,65000);
		System.out.println(salaries);
		
		List<Integer> increentedSalaries = new ArrayList<>();
		//60000,50000,30000,40000,70000
		
		Function<Integer, Integer> fun = (salary) -> salary + 5000;
		
		incrementedSalaries = salaries.stream()
										.map(fun);
										.toList();
										
		System.out.println(incrementedSalaries);
		
		//increment each salary by 10%
		List<Double> increSalaries = salaries.stream()
												.map((salary) -> salary + salary * .1)
												.toList();
		System.out.println(incrSalaries);
	}

}
