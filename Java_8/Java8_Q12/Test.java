package Java8_Q12;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {

		List<Item> itemList = new ArrayList<>();
		itemList.add(new Item(1, "Mobile", LocalDateTime.of(2022, 12, 01, 01, 10),LocalDateTime.of(2023, 12, 01, 01, 10), 10000f));
		itemList.add(new Item(2, "TV", LocalDateTime.of(2022, 11, 01, 01, 10), LocalDateTime.of(2024, 11, 01, 01, 20),20000f));
		itemList.add(new Item(3, "Watch", LocalDateTime.of(2022, 12, 01, 01, 10), null, 100f));
		itemList.add(new Item(4, "Dresses", LocalDateTime.of(2022, 12, 01, 01, 10), null, 2000f));
		itemList.add(new Item(5, "Jwellary", LocalDateTime.of(2022, 10, 01, 01, 10), null, 2000f));

		//1. WAP to find the average price of item from the list of given items.
		Double priceLst = itemList.stream().map(p -> p.getPrice()).collect(Collectors.averagingDouble(p -> p.floatValue()));
		System.out.println("Average price of item from the list :" + priceLst);
		
		//2. WAP to print detail of item which is having highest and lowest price.
		Float maxPrice = itemList.stream().map(p -> p.getPrice()).max(Comparator.naturalOrder()).get();
		Float minPrice = itemList.stream().map(p -> p.getPrice()).min(Comparator.naturalOrder()).get();

		System.out.println("Highest price :"+maxPrice);
		System.out.println("Lowest price :"+minPrice);
		
		//3.WAP to print the item with maximum price and not having any expiry date
				Optional<Float>item=itemList.stream().filter(p ->(p.getDate_of_expiry()==null))
								.map(p -> p.getPrice()).max(Comparator.naturalOrder());
				System.out.println("Items having Maximum price and not having any expiry date: "+item);
		
		//4. WAP to store item name and price from list to set. 
		
		Set<Item>list=itemList.stream().map(i->new Item(i.getIname(),i.getPrice() ) ).collect(Collectors.toSet());
		System.out.println("Set of item name and price :");
		for (Item item1 : list) {
			System.out.println(item1.getIname()+" "+item1.getPrice());
		}
		
		
		//5. WAP to remove duplicate prices from the list of the items.
		List<Float>distinct=itemList.stream().map(i->i.getPrice()).distinct().collect(Collectors.toList());
		System.out.println("Removed duplicate prices from the list of the items :"+distinct);
		
		
				
				
	}
}
