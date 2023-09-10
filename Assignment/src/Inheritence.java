
public class Inheritence {

	public static void main(String[] args) {
		GrandParent gp = new GrandParent();
		Parent p = new Parent();
		Child c = new Child();
		
		gp.iAmGrandParent("Grand Parent");
//		gp.iAmParent("Grand Parent"); //The method iAmParent(String) is undefined for the type GrandParent
//		gp.iAmChildClss("Grand Parent"); //The method iAmChildClss(String) is undefined for the type GrandParent
		
		p.iAmGrandParent("Parent");
		p.iAmParent("Parent");
//		p.iAmChildClss("Parent"); //The method iAmChildClss(String) is undefined for the type Parent
		
		c.iAmGrandParent("Child");
		c.iAmParent("Child");
		c.iAmChildClss("Child");
	}

}

class GrandParent{
	void iAmGrandParent(String s) {
		System.out.println(s+" Is Accessing Grand Parent class method: ");
	}
}

class Parent extends GrandParent{
	void iAmParent(String s) {
		System.out.println(s+" Is Accessing Parent Class Method: ");
	}
	
}

class Child extends Parent{
	void iAmChildClss(String s) {
		System.out.println(s+" Is Accessing child class method: ");
	}
}