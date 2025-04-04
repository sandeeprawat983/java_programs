package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Write a program to convert a list of strings to Upper case using Java Stream API
public class Example5 {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
		
		List<String> upperCaseStrings = strings.stream()
												.map(String::toUpperCase)
												.collect(Collectors.toList());
		
		System.out.println(upperCaseStrings);
	}

}
