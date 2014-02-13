package sef.module06.activity;

public class Square extends Shape {
	private double side;

	public double getSide() {
		return side;
	}

	public Square(double side, String color) {
		super(color);
		this.side = side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double calculateArea() {

		return side * side;
	}

	public double calculatePerimeter() {
		return side * 4;
	}
	
	public String toString(){
		return "usando método toString";
	}

}
