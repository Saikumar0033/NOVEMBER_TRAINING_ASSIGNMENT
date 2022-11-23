package Oops_Q1;

public class Test {
	public static void main(String[] args) {
		
		Department[] department = new Department[10];
		department[0] = new Department(11,"Accounts");

		Employee employee = new Employee(11092, "john", " Pune", "1/1/1999", 15000, "1/1/22", "hinjewadi",
				department[0], "0123456778", "john@gmail.com");

		Customer customer = new Customer(1, "james", "Delhi", "1/1/1980", "1/1/95", "Delhi", "0123456",
				"james@gmail.com");

		System.out.println(employee);
		System.out.println(customer);
		
	}
}
