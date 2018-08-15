

public class VegBurger extends Burger {

	private final static String VEG_BURGER = "Veg Burger";
	private final static float PRICE = 7.9f;
	
    public VegBurger() {
    	super();
    }
    
    public String getName() {
    	return VEG_BURGER;
    }
    
    public float getPrice() {
    	return PRICE;
    }

}