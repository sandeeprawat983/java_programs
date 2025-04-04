package programs;

import java.util.Arrays;
import java.util.List;

// Given a list of strings, write a program to count the number of strings 
// containing a specific character ‘a’ using Java Stream API
public class Example4 {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("apple", "banana", "orange", "grape");
		
		char searchChar = 'a';
		
		long count = strings.stream()
							.filter(str -> str.contains(String.valueOf(searchChar)))
							.count();
		
		System.out.println("Number of strings containing '" + searchChar + "' : " + count);
	}

}
