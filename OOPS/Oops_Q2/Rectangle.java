package Oops_Q2;

public class Rectangle implements Shape {

	public void area(double vertexA, double vertexB, double vertexC) {
		double areaOfRectangle = (vertexB - vertexA) * vertexC;
		System.out.println("Area Of Rectangle : " + areaOfRectangle);

	}

}
