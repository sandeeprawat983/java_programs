package streams.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Slicing a stream - part 2
public class MainJava8_8 {
	
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
		
		// skipping the elements
		List<Dish> dishes =
				menu.stream()
					.filter(dish -> dish.getCalories() > 300)
					.skip(2)
					.collect(Collectors.toList());
		
		System.out.println(dishes);
	}

}
