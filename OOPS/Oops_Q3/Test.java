package Oops_Q3;

public class Test {

	public static void main(String[] args) {
		
		Branch branch_Obj = new Branch(101, "Hyderabad Branch", "Hyd");

		Customer_Account_Statement customerAccountStatement = new Customer_Account_Statement(55, 12345, "Sai",
				"01/07/20", "18/05/22", branch_Obj, 10, 8000.00, 1000, "19/11/2022");

		System.out.println(customerAccountStatement);

	}
	
}
