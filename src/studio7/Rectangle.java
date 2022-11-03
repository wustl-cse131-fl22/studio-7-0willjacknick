package studio7;

public class Rectangle {
	private double length;
	private double width;
public Rectangle (double initlength, double initwidth) {
		length = initlength;
		width = initwidth;
				
}
	public double getArea(){
		double area = length * width;
		return area;
		}
	public double getPerimeter() {
		double perimeter = (2*length)+(2*width);
		return perimeter;
		}
	public String isSquare() {
		if (length==width) {
			return "square";
		}
		else {
			return "not square";
		}
	}
	public static void main(String[] args) {
		Rectangle rectangle1 = new Rectangle(3,4);
		System.out.println(rectangle1.getArea());
		System.out.println(rectangle1.getPerimeter());
		System.out.println(rectangle1.isSquare());
		
				
		
		
	}
	}
	

