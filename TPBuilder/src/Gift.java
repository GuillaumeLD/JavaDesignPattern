

public class Gift implements Item {

	private final static String GIFT = "Gift";
	private final static float PRICE = 0.0f;
	
    public Gift() {
    	super();
    }
    
    public String getName() {
    	return GIFT;
    }
    
    public float getPrice() {
    	return PRICE;
    }
    
    public Packaging getPackaging() {
    	return new Wrapper();
    }
    
}