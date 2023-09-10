public class First {

	public static void main(String[] args) {
//		new Print();
//		new DataType();
//		new TypeCasting();
//		new Operators(10);
		
		//Assignment 1 start
//		Shape rectangle = new Shape();
//		Shape cuboid = new Shape();
//		
//		rectangle.area(4,5);
//		System.out.println("Volume is: "+cuboid.volume(4,8,9));
		//Assignment 1 end
		
		//Assignment 2 start
//		Main main1 = new Main("Rohan");
//		Main main2 = new Main("Sohan");
//		Main main3 = new Main("Mohan");
		//Assignment 2 end
		
		//Assignment 3 start
//		System.out.println((new Example(4)).x);
		//Assignment 3 end
		
		//Assignment 4 start
		Student1 s1 = new Student1("Rohan", 1, 7);
		Student1 s2 = new Student1("Sohan", 2, 7);
		s1.display();
		s2.display();
		//Assignment 4 end;
		
	}
	
}
//Assignment 4 start
class Student1{
	String name;
	int rollNo;
	int class_;
	
	public Student1(String name, int rollNo, int class_) {
		this.name = name;
		this.rollNo = rollNo;
		this.class_ = class_;
	}
	
	public void display() {
		System.out.println("Name: "+name+", Roll Number: "+rollNo+", Class: "+class_);
	}
}
//Assignment 4 end

//Assignment 3 start
class Example{
	int x;
	public Example(int a) {
		x=a;
	}
}
//Assignment 3 end

//Assignment 2 start
	class Main{
		public Main(String s) {
			System.out.println("Welcome "+s+" to JAVA");
		}
	}
//Assignment 2 start

//Assignment 1 start
class Shape{
	public Shape() {
	}
	public void area(int height, int width) {
		System.out.println("area is: "+height*width);
	}
	public int volume(int height, int width, int length) {
	 return height*width*length;	
	}
}
//Assignment 1 end

class Print {
	Print() {
		System.out.println("Hello Java");
		System.out.print("Namaste Java");
		System.out.print("Kem Choo Java");
		System.out.println("Vanakkam Java");
		System.out.print("Nomoshkar Java");
		System.out.println("Namaskar Java");
	}
}

class DataType {
	DataType() {
		// data types
		int i = 0;
		System.out.println("the value of x is: " + i);

		double d = 10.0;
		System.out.println(d);

		float f = 2.0f;
		System.out.println(f);

		char ch = 'A';
		System.out.println(ch);

		boolean bool = true;
		System.out.println(bool);

		// Scope of variable local, global
		{
			int a = 9; // a is local var block level scope(not visible outside of block)
			System.out.println(a);
			System.out.println(i); // i is global var (visible everywhere in file)
		}
	}
}

class TypeCasting {
	TypeCasting() {
		// type casting / type promotion / type conversion (2 types)
		// assigning value of one primitive DT to other DT
		// Narrowing Casting (manually) converting a larger type to a smaller size type
		// double -> float -> long -> int -> char -> short -> byte
		// Widening Casting (Automatic) conversion opposite of narrowing

		// Narrowing conversion
		float discount = 667.63f;
		int discount1 = (int) discount;

		System.out.println("Discount after type casting: " + discount1);

		// byte = int/256 (because range of byte in 256)
		byte bi = (byte) discount1;
		System.out.println("Int to Byte: " + bi);

		// Automatic conversion
		double db = bi;
		System.out.println("Automatic conversion" + db);
	}
}

class Operators {
	Operators(int m) {

		// unary operator
		System.out.println(++m);
		System.out.println(--m);

		// binary operator
		System.out.println(m + m);
		System.out.println(m - m);
		System.out.println(m / m);
		System.out.println(m * m);
		System.out.println(m % m);

		// ternary operator
		System.out.println((m == 10) ? true : false);

	}
}