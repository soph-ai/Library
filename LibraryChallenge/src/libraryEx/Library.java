package libraryEx;

import java.util.ArrayList;
import java.util.List;

public class Library {
	// create an array of items
	private List<Items> items = new ArrayList<>();
	private int itemCount = 0;

	// print method
	public void printItems() {
		System.out.println(this.items);
	}

	// add items method, incl setting incremental id
	public boolean addItems(Items item) {
		item.setId(++itemCount);
		return this.items.add(item);
	}

	// remove items method
	public boolean removeItems(Items item) {
		return this.items.remove(item);
	}

	public boolean removeItemsById(int id) {
		for (Items it : this.items) {
			if (it.getId() == id) {
				return this.removeItems(it);
			}
		}
		return false;
	}

}
