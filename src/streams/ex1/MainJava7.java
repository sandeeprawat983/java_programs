package streams.ex1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class MainJava7 {

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
		
		// filters the elements using an accumulator
		List<Dish> lowCaloriesDishes = new LinkedList<>();
		for (Dish dish : menu) {
			if (dish.getCalories() < 400)
				lowCaloriesDishes.add(dish);
		}
		
//		System.out.println("Low Calories Dishes : " + lowCaloriesDishes);
		
		// sorts the dishes with anonymous class
		Collections.sort(lowCaloriesDishes, new Comparator<Dish>() {

			@Override
			public int compare(Dish o1, Dish o2) {
				return Integer.compare(o1.getCalories(), o2.getCalories());
			}
			
		});
		
//		System.out.println("Sorted Dishes : " + lowCaloriesDishes);
		
		// processes the sorted list to select the names of dishes
		List<String> lowCaloriesDishesName = new LinkedList<>();
		for (Dish dish : lowCaloriesDishes) {
			lowCaloriesDishesName.add(dish.getName());
		}
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("Dish names : " + lowCaloriesDishesName);
		System.out.println("Time taken : " + (endTime - startTime) + "ms");
	}
	
}
