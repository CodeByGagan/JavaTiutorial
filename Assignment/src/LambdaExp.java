
public class LambdaExp {

	public static void main(String[] args) {

		Calculator CalcObj = (int a,int b) -> {
			return  a+b;
			};
		System.out.println(CalcObj.add(7, 8));
			
		Calculator CalcObj1 = (a,b) -> {
			return  a+b;
			};
		System.out.println(CalcObj1.add(17, 8));
		
		
	}

}

interface Calculator {
	int add(int a, int b);
}
