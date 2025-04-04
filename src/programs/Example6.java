package programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// Given a list of integers, write a program to calculate the average of all the numbers using Java Stream API
public class Example6 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		OptionalDouble average = numbers.stream()
										.mapToDouble(Integer::doubleValue)
										.average();
		
		System.out.println("Average : " + (average.isPresent() ? average.getAsDouble() : "N/A"));
	}

}
