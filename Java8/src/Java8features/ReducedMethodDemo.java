package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReducedMethodDemo {

	public static void main(String[] args) {
		List<Integer> salaries = Arrays.asList(55000,45000,25000,35000,65000);
		System.out.println(salaries);
		
		BinaryOperator<integer> binOper = (sal1,sal2) -> sal1+sal2;
		
		int total = salaries.stream()
				.reduce((sal1 + sal2) -> sal1 + sal2))
				.get();
		System.out.println(sum);
		
		int totalSalary = salaries.stream()
							.mapToInt((salary) -> salary)
							.sum();
		System.out.println(totalSalary);
	}

}
