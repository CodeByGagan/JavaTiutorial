
public class Interface1 {

	public static void main(String[] args) {

		Eagle eagle = new Eagle();
		eagle.eating();
		eagle.sleeping();
		eagle.fly();
		
	}

}

interface Animal {
	void eating();
	void sleeping();
}

// one interface can extends onther interface (like class)
interface Bird extends Animal {
	void fly();
}

class Eagle implements Bird{
	
	public void eating() {
		System.out.println("Eating....");
	}
	public void sleeping() {
		System.out.println("Sleeping....");
	}
	public void fly() {
		System.out.println("Flying....");
	}
	
}