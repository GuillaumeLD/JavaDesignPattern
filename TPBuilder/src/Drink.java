

public abstract class Drink implements Item {

	private final static String DRINK = "Drink";
	
    public Drink() {
    	super();
    }

    public String getName() {
    	return DRINK;
    }
    
    public Packaging getPackaging() {
    	return new Bottle();
    }
    
}
