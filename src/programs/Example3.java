package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a program to filter out all the even numbers from a list using Java Stream API
public class Example3 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		List<Integer> evenNumbers = numbers.stream()
											.filter(number -> number % 2 == 0)
											.collect(Collectors.toList());
		
		System.out.println("Even numbers : " + evenNumbers);
	}

}
