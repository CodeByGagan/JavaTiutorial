
public class NewFile {

	public static void main(String[] args) {
		
		TwoDShape ob1 = new TwoDShape(2.2, 3.2);
		Rectangle rect1 = new Rectangle(7.0, 8.3);
		Square sq1 = new Square(25.25, 25.25);
	
		System.out.println("Two D Shape Area: "+ob1.area());
		System.out.println("Area Of Rectangle: "+rect1.area());
		System.out.println("Area Of Square: "+sq1.area());
		
		TwoDShape ob2;
		ob2 = sq1; // run time inheritence
		ob2.area();
		
	}

}

class TwoDShape {
	double dimension1, dimension2;
	public TwoDShape(double d1, double d2) {
		dimension1 = d1;
		dimension2 = d2;
	}

	double area() {
		System.out.println("Area of 2D shape: ");
		return 0;
	}

}

class Rectangle extends TwoDShape {
	public Rectangle(double d1, double d2) {
		super(d1,d2);
		System.out.println("This is Rectangle Class");
	}
	
	double area() {
		System.out.println("Rectangle class Area method");
		return dimension1*dimension2;
	}
}

class Square extends TwoDShape {
	public Square(double d1, double d2) {
		super(d1,d2);
		System.out.println("This is Square Class");
	}
	
	double area() {
		System.out.println("Square class Area method");
		return dimension1*dimension2;
	}

}