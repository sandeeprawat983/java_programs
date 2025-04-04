package streams.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// find three high calories dish names
public class MainJava8_3 {
	
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
		
		
		List<String> threeHighCaloricDishMenus = 
			menu.stream() // get a stream from menu (list of dishes)
				.filter(dish -> dish.getCalories() > 300) // create a pipeline of operations: first filter high calories dishes
				.map(Dish::getName) // gets the names of the dishes
				.limit(3) // selects only the first three
				.toList(); // stores the results in another list
		
		System.out.println(threeHighCaloricDishMenus);
	}

}
