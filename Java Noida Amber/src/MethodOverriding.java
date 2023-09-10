
public class MethodOverriding {

	public static void main(String[] args) {
		Maggi m = new Maggi();
		Gagan g = new Gagan();
		Sonu s = new Sonu();
		
		//when an overriden method is called by a subclass obj, it will always refer to the version of the method defined in subclass 
		m.prepare();
		g.prepare();
		s.prepare();
		
		Maggi r; //r is an superClass reference
		//superClass reference can store a subClass obj
		r=g; // r refer to Gagan class obj
		r.prepare();
		//run time polymorphism
		r=m;
		r.prepare();
	}

}

//Method overriding is only applicable in inheritence
//when a method in a subclass has the same method signature as a method in superClass then the method in the subClass is said to be overriden
class Maggi{
	void prepare() {
		System.out.println("Authentic 2 Minutes noodle");
	}
}

class Gagan extends Maggi{
	void prepare() {
		System.out.println("Authentic 2 Minutes egg noodle");
	}
}

class Sonu extends Maggi{
	void prepare() {
		System.out.println("Authentic 2 Minutes chicken noodle");
	}
}