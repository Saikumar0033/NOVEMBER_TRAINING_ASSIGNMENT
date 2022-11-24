package Exception_Q4;

public class Item {

	private String itemName;
	private double price;
	private int maximumNumberOfItem;
	Category category;

	public Item(String itemName, double price, int maximumNumberOfItem) {
		super();
		this.category = new Category(itemName);
		this.itemName = itemName;
		this.price = price;
		this.maximumNumberOfItem = maximumNumberOfItem;
	}

	public String getItemName() {
		return itemName;
	}

	public double getPrice() {
		return price;
	}

	public int getMaximumNumberOfItem() {
		return maximumNumberOfItem;
	}
	
	public Category getCategory() {
		return category;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", maximumNumberOfItem=" + maximumNumberOfItem + "]";
	}

}
