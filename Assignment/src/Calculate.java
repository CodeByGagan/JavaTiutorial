
public class Calculate {
	
	
	public static void main(String[] args) {
		
		Person p = new Person(4.2, 2.0, 1.2);
		System.out.println(p.volume());
		
		Person p1 = new Person(4.2);
		System.out.println(p1.volume());
		
		Person p2 = new Person();
		System.out.println(p2.volume());
		
	}

}
class Person{
	
double width, height, depth;
	
	public Person(double w, double h, double d) {
		width  = w;
		height = h;
		depth = d;
	}
	
	public Person() {
		width =0;
		height =0;
		depth = 0;
	}
	
	public Person(double length) {
		depth = height = width = length;
	}
	
	double volume() {
		return width*height*depth;
	}

}