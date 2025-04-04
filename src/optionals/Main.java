package optionals;

import java.util.Optional;

// Creating Optional Objects
public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// empty optional
		Optional<Car> optCar = Optional.empty();
//		System.out.println(optCar.get());
		
		
		Car car = new Car();
		car = null;
		// optional from a non-null value
		Optional<Car> optCar2 = Optional.of(car);
		System.out.println(optCar2);
		
		
		// optional from null
		Optional<Car> optCar3 = Optional.ofNullable(null);
		
	}
	
}
