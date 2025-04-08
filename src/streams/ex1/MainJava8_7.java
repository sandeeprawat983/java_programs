package streams.ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Slicing a stream
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
		
		List<Dish> slicedMenu2 = 
				specialMenu.stream()
							.dropWhile(dish -> dish.getCalories() < 320)
							.collect(Collectors.toList());
		
		System.out.println(slicedMenu2);
											
	}
	
}
