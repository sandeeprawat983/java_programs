package programs;

import java.util.Arrays;
import java.util.List;

// Given a list of integers, to find and print the maximum element using Java Stream API
public class Example2 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10);
		
		int max = numbers.stream()
				.mapToInt(Integer::intValue)
				.max()
				.orElseThrow();
		
		System.out.println("Max element: " + max);
	}

}
