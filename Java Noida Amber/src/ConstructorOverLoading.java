
public class ConstructorOverLoading {

	public static void main(String[] args) {
		Shape4 s1 = new Shape4();
		Shape4 s2 = new Shape4(1);
		Shape4 s3 = new Shape4(1.0,2.0);
		Shape4 s4 = new Shape4(1.0,2.0,3.0);
		Shape4 s5 = new Shape4(2,2.0,3.0);
		
//		System.out.println(s1.calVolume());
//		System.out.println(s2.calVolume());
//		System.out.println(s3.calVolume());
//		System.out.println(s4.calVolume());
//		System.out.println(s5.calVolume());
		
		System.out.println(Shape4.staticCube(2));
	}

}
 class Shape4{

		static int staticCube(int x) {
			System.out.print("cube of "+x+" is ");
			return x*x*x;
		}
	double width, height, depth;
	
	//constructor overloading // this is polymorphism
	//we can define as many as constructor of same name but all constructor should have different method signature.
	//constructor overloading allows a class to have multiple costructor with different method signature
	//uses-> allows obj initializaton with different initial states
	
	
	public Shape4() {
		width=2.0;
		height=3.0;
		depth=4;
	}
	public Shape4(double w) {
		width=w;
		height=4.0;
		depth=4.0;
	}
 
 public Shape4(float w) {
	 width=w;
	 height=3.0;
	 depth=4.0;
 }
	public Shape4(double w, double h) {
		width=w;
		height=h;
		depth=4.0;
	}
	public Shape4(double w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	public Shape4(int w, double h, double d) {
		width=w;
		height=h;
		depth=d;
	}
	double calVolume() {
		return width*height*depth;
	}
}
