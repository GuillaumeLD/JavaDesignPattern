import java.util.ArrayList;

public class MealBuilder {

	private ArrayList<Item> listeItems;
	
	public MealBuilder() {
		this.listeItems = null;
	}
	
    public MealBuilder(ArrayList<Item> listeItems) {
    	this.listeItems = listeItems;
    }

    public Meal build() {
    	Meal meal = new Meal();
    	meal.listeItems = listeItems;
    	
    	return meal;
    }
    
    public Meal prepareVegMeal() {
        
    	Meal meal = new Meal();
    	meal.addItem(new VegBurger());
    	meal.addItem(new Pepsi());
    	return meal;
    }

    public Meal prepareNonVegMeal() {
        
    	Meal meal = new Meal();
    	meal.addItem(new ChickenBurger());
    	meal.addItem(new Coke());
    	return meal;
    }

}