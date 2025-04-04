package streams.ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MainJava8 {

	public static void main(String[] args) {
		// dish menu
		List<Dish> menu = Arrays.asList(
							new Dish("Dish1", 200),
							new Dish("Dish2", 300),
							new Dish("Dish3", 400),
							new Dish("Dish4", 100),
							new Dish("Dish5", 500)
						);
				
				System.out.println("Menu : " + menu);
			
		long startTime = System.currentTimeMillis();
		List<String> lowCaloriesDishesName = menu.stream()
				.filter(dish -> dish.getCalories() < 400)  // select dishes that are below 400 calories
				.sorted(Comparator.comparing(Dish::getCalories))  // sorts them by calories
				.map(Dish::getName)  // extract the names of these dishes
				.toList();  // stores all the names in list
		long endTime = System.currentTimeMillis();
		
		System.out.println("Low Calories Dishes Name : " + lowCaloriesDishesName);
		System.out.println("Time taken : " + (endTime - startTime) + "ms");
	}
	
}
