

public class Main {

    public static void main(String[] args) {

    	MealBuilder mealBuilder = new MealBuilder();
    	
    	Meal vegMeal = mealBuilder.prepareVegMeal();
    	System.out.println("Veg Meal : ");
    	vegMeal.showItems();
    	System.out.println("Price : " + vegMeal.getPrice());
    	
    	Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
    	System.out.println("Non Veg Meal : ");
    	nonVegMeal.showItems();
    	System.out.println("Price : " + nonVegMeal.getPrice());
    	 
    }

}