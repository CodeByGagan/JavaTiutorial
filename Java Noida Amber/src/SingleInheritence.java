
public class SingleInheritence {

	public static void main(String[] args) {
		
		Learner learner1 = new Learner();
		Amber amber1 = new Amber();
		
		learner1.name = "Rohan";
		learner1.genId = 1;
		
		learner1.showDetails();
		
		//Accessing superclass member by subclass obj
		amber1.name = "Sohan";
		amber1.genId = 2;
		amber1.showDetails();
		
		//Accessing subclass member by subclass obj
		amber1.sipId = 20232;
		amber1.showSipId();
		amber1.amberDetails();
		
	}

}

class Learner{
	
	String name;
	int genId;
	
	void showDetails() {
		System.out.println("Learner's Name: "+name+"\nLearner's Id: "+genId);
	}
}

//Amber inheriting Learner
//After inheritence all the public member of super class will now be member of sub class
//subclass is specialized version of superclass
class Amber extends Learner{
	
	int sipId;
	
	void showSipId() {
		System.out.println("SIPID: "+sipId);
	}
	
	void amberDetails() {
		System.out.println("SIPID + GenId: "+(sipId+genId));
	}
	
}