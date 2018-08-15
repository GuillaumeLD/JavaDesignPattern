

public class Main {

    public static void main(String[] args) {

    	MealBuilder mealBuilder = new MealBuilder();
    	
    	Meal vegMeal = mealBuilder.reset().prepareVegMeal().build();
    	System.out.println("Veg Meal : ");
    	vegMeal.show();
    	
    	Meal nonVegMeal = mealBuilder.reset().prepareNonVegMeal().build();
    	System.out.println("Non Veg Meal : ");
    	nonVegMeal.show();
    	
    	Meal infiniteMeal = mealBuilder.reset().add(new Coke())
    									.add(new VegBurger())
    									.add(new VegBurger())
    									.add(new Gift())
    									.build();
    	 System.out.println("Infinite Meal : ");
    	 infiniteMeal.show();
    	 
    	 Meal repeatMeal = mealBuilder.reset().add(new ChickenBurger(), 3).build();
    	 System.out.println("Repeat Meal : ");
    	 repeatMeal.show();
    	 
    }

}