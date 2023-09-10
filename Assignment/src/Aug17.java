
public class Aug17 {

	public static void main(String[] args) {
//		access obj1 = new access();
//        access obj2 = new access();   
//        obj1.x = 0;
//        obj1.y = 0;
//        obj1.cal(1, 2); // obj1.x=1, y=2
//        obj2.x = 0;  // obj2.x=0, y=2
//        obj2.cal(2, 3);// obj2.y = 2+3 =5
//        System.out.println(obj1.x + " " + obj2.y);  
		
//		access obj1 = new access();
//        access obj2 = new access();
//        obj1.x = 0;   
//        obj1.increment();
//        obj2.increment();
//        System.out.println(obj1.x + " " + obj2.x);
		
		static_out obj1 = new static_out();
        static_out obj2 = new static_out();   
        int a = 2;
        obj1.add(a, a + 1);
        obj2.add(5, a);
        System.out.println(obj1.x + " " + obj2.y);     
    
		
		
	}

}
//class access
//{
//    public int x;
//	static int y;
//    void cal(int a, int b)
//    {
//        x +=  a ;
//        y +=  b;
//    }        
//}    


//class access
//{
//   static int x;
//   void increment()
//   {
//       x++;
//   }   
// } 

class static_out 
{
    static int x;
	static int y;
    void add(int a , int b)
    {
        x = a + b;
        y = x + b;
    }
}    
