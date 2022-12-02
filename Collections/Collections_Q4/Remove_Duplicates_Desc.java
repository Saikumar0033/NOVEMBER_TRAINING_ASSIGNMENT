package Collections_Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*WAP to store elements in List and remove all duplicates names of items. After 
duplicates are removed print all elements in descending order*/

public class Remove_Duplicates_Desc {

	public static void main(String[] args) {
		List<Item> list = new ArrayList<>();
		list.add(new Item(3, "mango", 45));
		list.add(new Item(1, "orange", 30));
		list.add(new Item(6, "apple", 15));
		list.add(new Item(4, "mango", 56));
		list.add(new Item(9, "apple", 45));
		System.out.println(removeDup(list));
	}
	
	
	
	//this method will remove all duplicate item names and return list with elements in descending order
	static List<Item> removeDup(List<Item> list){
		for(int i=0;i<list.size();i++) {
			for(int j=i+1; j<list.size();j++) {
				if(list.get(i).getName().equalsIgnoreCase(list.get(j).getName())) {
					list.remove(j);
					
				}
			}
		}
		Collections.sort(list, new CompareItem());
		//Collections.sort(list);
		return list;
	}
}
