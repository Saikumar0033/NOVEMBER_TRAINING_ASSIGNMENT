package Oops_Q2;

public class Square implements Shape {

	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfSquare = (vertexB - vertexA) * (vertexB - vertexA);
		System.out.println("Area Of Square : " + areaOfSquare);

	}

}
