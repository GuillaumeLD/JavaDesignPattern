

public class ChickenBurger extends Burger {

	private final static String CHICKEN_BURGER = "Chicken Burger"; 
	private final static float PRICE = 30.0f;

    public ChickenBurger() {
    }

    public String getName() {
    	return CHICKEN_BURGER;
    }
    
    public float getPrice() {
    	return PRICE;
    }
}