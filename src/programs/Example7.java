package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a program to sort a list of strings in alphabetical order using Java Stream API
public class Example7 {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
		
		List<String> sortedStrings = strings.stream()
											.sorted()
											.collect(Collectors.toList());
		
		System.out.println("Sorted Strings : " + sortedStrings);
	}

}
