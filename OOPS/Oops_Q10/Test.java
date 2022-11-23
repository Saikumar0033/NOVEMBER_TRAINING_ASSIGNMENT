package Oops_Q10;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Product p1 = new Product(1,"shampoo", 2,"rs");
		Product p2 = (Product)p1.clone();
		
		System.out.println("object1 product name: "+p1.pname+" - "+p1.price+p1.unitOfMeasurement);
		System.out.println("object2 product name & price: "+p2.pname+" - "+p2.price+p2.unitOfMeasurement);
		
		p2.pname = "soap";
		p2.price = 10;
		System.out.println("object2 product name & price after changing: "+p2.pname+" - "+p2.price+p2.unitOfMeasurement);
		
		
		boolean b1 = p2 instanceof Product;
		System.out.println(b1);
	}

}
