

public class ChickenBurger extends Burger {

	private final static String CHICKEN_BURGER = "Chicken Burger"; 
	private final static float PRICE = 9.9f;

    public ChickenBurger() {
    	super();
    }

    public String getName() {
    	return CHICKEN_BURGER;
    }
    
    public float getPrice() {
    	return PRICE;
    }
}