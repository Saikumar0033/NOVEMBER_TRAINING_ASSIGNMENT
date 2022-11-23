package Oops_Q6;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Find maximum of 3 ,4 for n number");

		int n = sc.nextInt();

		if (n == 3) {

			System.out.println("Enter 3 digit number");

			int number = sc.nextInt();

			MaxNumber1 m1 = new MaxNumber1();

			m1.getNumbers(number);
		}

		if (n == 4) {

			System.out.println("Enter 4 digit number");

			int number = sc.nextInt();

			MaxNumber2 m2 = new MaxNumber2();

			m2.getNumbers(number);
		}

		if (n > 4) {

			System.out.println("Enter n digit number");

			int number = sc.nextInt();

			MaxNumber3 m3 = new MaxNumber3();

			m3.getNumbers(number);
		}

	}

}

