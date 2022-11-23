package Oops_Q4;

import java.util.Scanner;

public class Area {

	static Scanner sc = new Scanner(System.in);
	private static int circleInput;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter You want to find area of ");

		System.out.println("for Area Of Square press    : 1");
		System.out.println("for Area Of rectangle press : 2");
		System.out.println("for Area Of  triangle press : 3");

		int circleInput = scanner.nextInt();

		switch(circleInput) {
		case 1:
			areaOfSquare();
		case 2:
			areaOfRectangle();
		case 3:
			areaOfTriangle();
		case default:
			System.out.println("Invalid selection");
		}

	}

	public static void areaOfSquare() {

		System.out.println("Enter the First side ");

		int firstSide = sc.nextInt();

		double areaOfSquare = firstSide * firstSide;

		System.out.println("Area of Square : " + areaOfSquare);

	}

	public static void areaOfRectangle() {

		System.out.println("Enter the First side ");

		int firstSide = sc.nextInt();

		System.out.println("Enter the Second side ");

		int secondSide = sc.nextInt();

		double areaOfRectangle = firstSide * secondSide;

		System.out.println("Area of Rectangle : " + areaOfRectangle);

	}

	public static void areaOfTriangle() {

		System.out.println("Enter the side ");

		int firstSide = sc.nextInt();

		System.out.println("Enter the Second side ");

		int secondSide = sc.nextInt();

		double areaOfTriangle = (firstSide * secondSide) / 2;

		System.out.println("Area of Triangle : " + areaOfTriangle);

	}

}

