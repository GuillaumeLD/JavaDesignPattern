

public abstract class Burger implements Item {

	private final static String BURGER = "Burger";
	
    public Burger() {
    	super();
    }
    
    public String getName() {
    	return BURGER;
    }
    
    public Packaging getPackaging() {
    	return new Wrapper();
    }
    
}