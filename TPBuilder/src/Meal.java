
import java.util.*;

public class Meal {

	public ArrayList<Item> listeItems = new ArrayList<Item>();

	// Affiche les items d'un repas
	public void show() {

		for (Item item : listeItems) {
			System.out.println(
					"Nom : " + item.getName() + ", Prix : " + item.getPrice() + ", Packaging = " + item.getPackaging().getName() );
		}
		System.out.println("Price : " + getPrice() + "\n");
	}

	// Ajoute un item à un repas
	public Meal addItem(Item item) {
		listeItems.add(item);
		return this;
	}

	// Renvoie le prix d'un repas
	public float getPrice() {

		float price = 0.0f;
		for (Item item : listeItems) {
			price += item.getPrice();
		}
		float roundPrice = (float) (((int) (price * 100)) / 100.0);
		return roundPrice;
	}

}