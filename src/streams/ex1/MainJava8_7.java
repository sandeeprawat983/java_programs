package streams.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Slicing a stream - part 1
public class MainJava8_7 {

	public static void main(String[] args) {
		// special list of dishes
		List<Dish> specialMenu = Arrays.asList(
				new Dish("seasonal fruit", 120, true, Type.OTHER),
				new Dish("prawns", 300, false, Type.FISH),
				new Dish("rice", 350, true, Type.OTHER),
				new Dish("chicken", 400, false, Type.MEAT),
				new Dish("french fries", 530, true, Type.OTHER));
		
		// using takeWhile
		List<Dish> slicedMenu1 = 
				specialMenu.stream()
							.takeWhile(dish -> dish.getCalories() < 320)
							.collect(Collectors.toList()); 
		
		System.out.println(slicedMenu1);
		
		// using dropWhile
		List<Dish> slicedMenu2 = 
				specialMenu.stream()
							.dropWhile(dish -> dish.getCalories() < 320)
							.collect(Collectors.toList());
		
		System.out.println(slicedMenu2);
		
		// Truncating the stream
		// create a list by selecting the first three dishes that have more than 
		List<Dish> dishes = 
					specialMenu.stream()
								.filter(dish -> dish.getCalories() > 300)
								.limit(3)
								.collect(Collectors.toList());
		
		System.out.println(dishes);
	}
	
}
