

public class Item {

    public Item() {
    }

    public Item(String name, float price, Packaging packaging) {
		super();
		this.name = name;
		this.price = price;
		this.packaging = packaging;
	}

	private String name;
    private float price;
    private Packaging packaging;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

}