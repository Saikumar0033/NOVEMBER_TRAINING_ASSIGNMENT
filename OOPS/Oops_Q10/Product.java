package Oops_Q10;

public class Product implements Cloneable {
	
	int pid;
	String pname;
	int price;
	String unitOfMeasurement;

	public Product(int pid, String pname, int price, String unitOfMeasurement) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.unitOfMeasurement = unitOfMeasurement;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

