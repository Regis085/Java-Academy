package sef.module06.activity;

public class Rectangle extends Shape {
	private double length, breadth;

	public Rectangle(double length, double breadth, String color) {
		super(color);
		this.length = length;
		this.breadth = breadth;
	}

	public double getHeight() {
		return length;
	}

	public void setHeight(double height) {
		this.length = height;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		return length * breadth;
	}

	@Override
	public double calculatePerimeter() {
		return length * 2 + breadth * 2;
	}

}
