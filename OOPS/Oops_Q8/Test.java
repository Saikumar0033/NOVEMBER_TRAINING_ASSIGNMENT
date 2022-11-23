package Oops_Q8;

import java.text.ParseException;

public class Test {
	
	public static void main(String[] args) throws ParseException {
		Electronics lcd = new LCD(2, "Sony", "22/01/2008");
		System.out.println(lcd);
		
		Electronics mobile = new Mobile(3,"Samsung","07/07/2007");
		System.out.println(mobile);
		
		Electronics laptop = new Laptop(5,"HP","02/09/2008");
		System.out.println(laptop);
		
	}
	
}
