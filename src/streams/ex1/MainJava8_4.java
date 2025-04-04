package streams.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Traverse only once
public class MainJava8_4 {
	
	public static void main(String[] args) {
		List<String> title = Arrays.asList("Modern", "Java", "In", "Action");
		Stream<String> s = title.stream();
		
		s.forEach(System.out::println);
		
		s.forEach(System.out::println); // java.lang.IllegalStateException: stream has already been operated upon or closed
	}

}
