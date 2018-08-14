
import java.util.*;

public class Meal {

	public ArrayList<Item> listeItems;

	public Meal() {
	}

	public void showItems() {
		
		for (Item item : listeItems) {
			System.out.println("Nom : " + item.getName() + ", Prix : " + item.getPrice()
			+ ", Packaging = " + item.getPackaging().getName());
		}
	}

    public void addItem(Item item)
	{
		listeItems.add(item);
	}

	public float getPrice() {
		
		float price = 0.0f;
		for (Item item : listeItems) {
			price += item.getPrice();
		}
		return price;
	}

}