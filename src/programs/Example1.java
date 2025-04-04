package programs;

import java.util.Arrays;
import java.util.List;

// find the sum of all elements in a list using Java Stream API
public class Example1 {
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		int sum = numbers.stream()
				.mapToInt(Integer::intValue)
				.sum();
		
		System.out.println(sum);
	}

}
