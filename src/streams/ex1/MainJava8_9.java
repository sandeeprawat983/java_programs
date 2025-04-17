package streams.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Mapping with map() and flatMap() methods - Part 1
// applying a function to each element of a stream
public class MainJava8_9 {

	public static void main(String[] args) {
		List<Dish> menu = Arrays.asList(
                new Dish("pork", 800, false, Type.MEAT),
                new Dish("beef", 700, false, Type.MEAT),
                new Dish("chicken", 400, false, Type.MEAT),
                new Dish("french fries", 530, true, Type.OTHER),
                new Dish("rice", 350, true, Type.OTHER),
                new Dish("season fruit", 120, true, Type.OTHER),
                new Dish("pizza", 550, true, Type.OTHER),
                new Dish("prawns", 300, false, Type.FISH),
                new Dish("salmon", 450, false, Type.FISH)
        );

		/**
		 	following code you pass a
			method reference Dish::getName to the map method to extract the names of the dishes
			in the stream
		 */
		List<String> dishNames =
				menu.stream()
					.map(Dish::getName)
					.collect(Collectors.toList());

		System.out.println(dishNames);

		/**
		 	Given
			a list of words, you’d like to return a list of the number of characters for each word
		 */
		List<String> words = Arrays.asList("Modern", "Java", "In", "Ation");
		List<Integer> wordLengths =
				words.stream()
					 .map(String::length)
					 .collect(Collectors.toList());

		System.out.println(wordLengths);

		/**
		 	First extract the name and then
		 	get the length of each element from a stream
		 */
		List<Integer> dishNameLengths =
				menu.stream()
					.map(Dish::getName)
					.map(String::length)
					.collect(Collectors.toList());

		System.out.println(dishNameLengths);

        // Flattening streams
        List<String> words2 = Arrays.asList("Hello", "World");
        List<String> uniqueCharacters =
                words2.stream()
                        .map(word -> word.split(""))
                        .flatMap(Arrays::stream)
                        .distinct()
                        .toList();

        System.out.println(uniqueCharacters);
    }

}
