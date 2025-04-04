package programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, write a program to concatenate all the strings using Java Stream API
public class Example8 {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
		
		String concatenatedStrings = strings.stream()
											.collect(Collectors.joining());
		
		System.out.println("Concatenated Strings : " + concatenatedStrings);
	}

}
