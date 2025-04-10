package streams.ex1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

// filtering with a predicate
public class MainJava8_6 {
	
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
		
		// explicitly manage iteration over a collection of data (external iteration)
		List<Dish> vegetarianDishes = new LinkedList<>();
		for (Dish dish : menu) {
			if (dish.isVegetarian())
				vegetarianDishes.add(dish);
		}
		System.out.println(vegetarianDishes);
		
		// Streams API (internal iteration), which supports the filter and collect operations
		List<Dish> vegetarianDishes2 = menu.stream()
				.filter(Dish::isVegetarian) // use a method reference to check if a dish is vegetarian friendly.
				.collect(Collectors.toList());
		System.out.println(vegetarianDishes2);
		
		// filtering unique elements
		// the following code filters all even numbers from a list and then eliminates duplicates 
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		numbers.stream()
				.filter(num -> num % 2 == 0)
				.distinct()
				.forEach(System.out::println);
	}

}
