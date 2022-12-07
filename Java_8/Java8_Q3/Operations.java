package Java8_Q3;

import java.util.Scanner;
import java.util.stream.IntStream;

/* User will be asked to enter two integer like 1 34 or 2 44 or 3 151 or 4 
454. 1 to check given no is even, 2 for odd number, 3 for Armstrong 
number, 4 for palindrome number*/
public class Operations {
	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			System.out.println("Enter the two numbers");
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
		switch (n1) {
		case 1:
		case 2:
			if (n2 % 2 == 0) {
				System.out.println("Number is even");
			} else {
				System.out.println("Number is odd");
			}
			flag = false;
			break;
		case 3:
			// this will check the amstrong number
			int reduce = IntStream.iterate(n2, i -> i / 10).map(n -> n % 10).limit(String.valueOf(n2).length())
					.reduce(0, (a, b) -> a = a + (b * b * b));
			if (reduce == n2) {
				System.out.println("Amstrong number");
			} else {
				System.out.println("not amstrong number");
			}
			flag = false;
			break;
		case 4:
			//this will return reverse of the given integer
			int reverse = IntStream.iterate(n2, i -> i / 10).map(n -> n % 10).limit(String.valueOf(n2).length())
					.reduce(0, (a, b) -> a = a * 10 + b);

			if (reverse == n2) {
				System.out.println("The number is Palindrome");

			} else {

				System.out.println("The number is Not-Palindrome");

			}
			flag = false;
			break;
		case default:
			System.out.println("Enter the first number in between 1 to 4 to perform operations like \n1 for even \n2 for odd \n3 for amstrong number and \n4 for palindrome");
			break;

		}
		}

	}
}
