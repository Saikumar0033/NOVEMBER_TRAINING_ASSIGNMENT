package Exception_Q4;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) throws ItemPurchaseLimitExceed {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of items you want to add in the list : ");
		int count=sc.nextInt();
		Item[] item = new Item[count];
		for( int i=0;i<count;i++) {
			System.out.println("Item-"+(i+1)+"  :: ");
			System.out.println("enter the item name: ");
			String name = sc.next();
			System.out.println("enter the item price: ");
			double price= sc.nextDouble();
			System.out.println("enter the item maximum limit: ");
			int max= sc.nextInt();
			if(price<=0 || max<=0) {
				throw new ItemPurchaseLimitExceed("Item price or maximum limit cannot be 0 or less");
			}
			item[i] = new Item(name, price, max);
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(item[i].getCategory());
		}
		
		System.out.println("Enter the number of items you want to buy: ");
		int items = sc.nextInt();
		if(items>count) {
			throw new ItemPurchaseLimitExceed("Selected more number than the available items list");
		}
		
		ItemBought[] itemBought = new ItemBought[items];
		
		for(int i=0;i<items;i++) {
			System.out.println("Enter the item id from the above items list: ");
	        int itemid = sc.nextInt();
	        System.out.println("Enter the quantity:");
	        int quantity = sc.nextInt();
	        itemBought[i] = new ItemBought(itemid, quantity);
		}
		double totalBill=0;
		for(ItemBought ib: itemBought) {
			for(int i=0;i<item.length;i++) {
				if(ib.itemid==item[i].getCategory().catid) {
					if(ib.itemquantity>item[i].getMaximumNumberOfItem()) {
						throw new ItemPurchaseLimitExceed("quantity is more than maximum limit of item");
					}else {
					System.out.println(item[i].getItemName()+", price:"+item[i].getPrice()+", quantity bought:"+ib.itemquantity);
					totalBill =totalBill + (ib.itemquantity*item[i].getPrice());
				}
				}
			}
		}
		System.out.println("Total bill is: "+totalBill);
	}

}
