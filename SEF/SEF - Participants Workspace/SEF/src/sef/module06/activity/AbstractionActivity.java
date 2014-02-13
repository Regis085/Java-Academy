package sef.module06.activity;

public class AbstractionActivity {

	public static void main(String[] args) {

		Square s = new Square(5, "blue");
		System.out.println(s);
		System.out.println("Printing Data about the Square with a side of 5: ");
		System.out.println("Color: " + s.getColor());
		System.out.println("Area: " + s.calculateArea());
		System.out.println("Perimeter: " + s.calculatePerimeter());
		System.out.println("---------------------------------");

		Rectangle r = new Rectangle(5, 6, "red");
		System.out.println("Printing Data about the Rectangle");
		System.out.println("Color: " + r.getColor());
		System.out.println("Area: " + r.calculateArea());
		System.out.println("Perimeter: " + r.calculatePerimeter());
	}

}
