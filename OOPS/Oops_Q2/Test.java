package Oops_Q2;

public class Test {
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		rectangle.area(10, 20, 50);

		Shape square = new Square();
		square.area(0, 50, 50);

		Shape triangle = new Triangle();
		triangle.area(10, 50, 70);
	}
}
