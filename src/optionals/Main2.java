package optionals;

import java.util.Optional;

// extracting and transforming values from Optional with map
public class Main2 {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Insurance insurance = new Insurance();
		
		// check whether insurance is null before extracting the name as follows:
		String name = null;
		if (insurance != null) {
			name = insurance.getName();
		}
		
		// Optional supports a map method for this pattern, which works as follows:
		Optional<Insurance> optInsurance = Optional.ofNullable(insurance);
		Optional<String> optName = optInsurance.map(Insurance::getName);
//		System.out.println(optName.get());
	}

}
