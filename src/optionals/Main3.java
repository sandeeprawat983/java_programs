package optionals;

import java.util.Optional;

// Chaining Optional objects with flatMap
public class Main3 {

	// finding a car's insurance company name with Optional
	public static String getCarInsuranceName(Optional<Person> person) {
		return person.flatMap(Person::getCar)
				.flatMap(Car::getInsurance)
				.map(Insurance::getName)
				.orElse("Unknown");
	}
	
	public static void main(String[] args) {
		Insurance insurance = new Insurance();
//		insurance.setName("Bajaj");
		insurance.setName(null);
		Car car = new Car();
		car.setInsurance(Optional.of(insurance));
		Person person = new Person();
		person.setCar(Optional.of(car));
		
		String name = getCarInsuranceName(Optional.of(person));
		System.out.println(name);
	}
	
}
