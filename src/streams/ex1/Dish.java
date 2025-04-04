package streams.ex1;

public class Dish {

	private String name;
	private int calories;
	private boolean vegetarian;
	private Type type;

	public Dish() {
		super();
	}

	public Dish(String name, int calories) {
		super();
		this.name = name;
		this.calories = calories;
	}

	public Dish(String name, int calories, boolean vegetarian, Type type) {
		super();
		this.name = name;
		this.calories = calories;
		this.vegetarian = vegetarian;
		this.type = type;
	}

	public int getCalories() {
		return calories;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return "Dish [name=" + name + ", calories=" + calories + ", vegetarian=" + vegetarian + ", type=" + type + "]";
	}
	
}
