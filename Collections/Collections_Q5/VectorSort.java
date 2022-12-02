package Collections_Q5;

import java.util.Collections;
import java.util.Vector;

/* WAP to store data related to item in Vector and after that sort the data. */
class VectorSort {

	public static void main(String[] args) {
		Vector<Item> vector = new Vector<>();
		vector.add(new Item(4,"apple",20));
		vector.add(new Item(3,"orange",15));
		vector.add(new Item(1,"mango",30));
		vector.add(new Item(5,"grapes",40));
		
		Collections.sort(vector, new CompareItem());
		for(int i=0;i<vector.size();i++) {
			int k = vector.get(i).getId();
			String name = vector.get(i).getName();
			double price = vector.get(i).getPrice();
			System.out.println("id= "+k+", name= "+name+", price= "+price);
		}
	}
}
