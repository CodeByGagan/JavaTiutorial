
public class InterfaceAssignment {

	public static void main(String[] args) {
		Result s1 = new Result();
		s1.getNumber(1);
		s1.getMarks(2.0f, 3.2f);
		s1.display();
	}

}

class Student1{
	int rollNo;
	void getNumber(int n){
		rollNo = n;
	}
	void showNumber() {
		System.out.println("Roll no: "+rollNo);
	}
}

class Test extends Student1{
	float sem1, sem2;
	void getMarks(float f1, float f2) {
		sem1 = f1;
		sem2 = f2;
	}
	void showMarks() {
		System.out.println("Sem1 marks: "+sem1+"\nSem2 Marks: "+sem2);
	}
}

interface Sports{
	double sportWeight = 6.0;
	void showSportsMarks();
}

class Result extends Test implements Sports {
	@Override
	public void showSportsMarks() {
		System.out.println("Sport Weight: "+sportWeight);
	}
	void display() {
		showNumber();
		showMarks();
		showSportsMarks();
		double total = sem1+sem2+sportWeight;
		System.out.println("Total Marks: "+total);
	}
}