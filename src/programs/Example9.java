package programs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Write a program to find the longest string in a list of strings using Java Stream API
public class Example9 {
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("banana", "orange", "apple", "grape");
		
		Optional<String> longestString = strings.stream()
										.max((s1, s2) -> s1.length() - s2.length());
										
		
		System.out.println("Longest String : " + (longestString.isPresent() ? longestString.get() : "N/A"));
	}

}
