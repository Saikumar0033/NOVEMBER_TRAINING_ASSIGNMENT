package Exception_Q4;

public class Category {

	int catid;
	String categoryname;
	static int count=1;
	
	Category(String categoryname){
		this.catid = count++;
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Item Number=" + catid + ", Item Name=" + categoryname;
	}
	
	
}
