
public class MealBuilder {

	private Meal meal;
	
	// Solution pour empecher l'affichage redondant de toute la liste à chaque nouveau build (comportement inattendu...)
	// consistant à repartir d'un nouveau Meal (et donc nouvelle liste d'items)
	public MealBuilder reset() {
		meal = new Meal();
		return this;
	}

	public MealBuilder prepareVegMeal() {
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return this;
	}

	public MealBuilder prepareNonVegMeal() {
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return this;
	}
	
	public MealBuilder add(Item item) {
		meal.addItem(item);
		return this;
	}
	
	public MealBuilder add(Item item, int count) {
		
		for (int i = 0; i < count; i++) {
			meal.addItem(item);
		}
		return this;
	}

	public Meal build() {
		return meal;
	}

}