//
//
//public abstract class Item {
//
//	private String name;
//    private float price;
//    public Packaging packaging;
//	
//    public Item() {
//
//    }
//
//    public Item(String name, float price, Packaging packaging) {
//		super();
//		this.name = name;
//		this.price = price;
//		this.packaging = packaging;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public float getPrice() {
//		return price;
//	}
//
//	public void setPrice(float price) {
//		this.price = price;
//	}
//
//	public Packaging getPackaging() {
//		return packaging;
//	}
//
//	public void setPackaging(Packaging packaging) {
//		this.packaging = packaging;
//	}
//
//}

public interface Item {
	
	public String getName();
	public Packaging getPackaging();
	public float getPrice();
	
}