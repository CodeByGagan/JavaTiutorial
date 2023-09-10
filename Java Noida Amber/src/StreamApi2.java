import java.util.ArrayList;

public class StreamApi2 {

	public static void main(String[] args) {
		
//		ArrayList<Emp> arrEmp = new ArrayList<Emp>();
//		
//		arrEmp.add(new Emp(1, "Rohan", 12000.35));
//		arrEmp.add(new Emp(2, "Gohan", 1000.35));
//		arrEmp.add(new Emp(3, "Sohan", 14000.35));
//		arrEmp.add(new Emp(4, "Mohan", 126000.35));
//		arrEmp.add(new Emp(5, "Roshan", 2000.35));
//		
//		arrEmp.stream()
//		.filter(e -> e.salary > 10000.00)
//		.forEach(e -> System.out.println("Name: "+e.name+", Salary: "+e.salary ));
//		
//		long count = arrEmp.stream()
//		.filter(e -> e.salary > 10000.00)
//		.count();
//		
//		System.out.println(count+" Employee salary is more than 10000.00");
		
		
		ArrayList<Book> library = new ArrayList<>();
		library.add(new Book("Java", "1","Rohan Book House", 5100));
		library.add(new Book("CSS", "2","Sohan Book House", 500));
		library.add(new Book("HTML", "3","Mohan Book House", 2100));
		library.add(new Book("React", "4","Gohan Book House", 6000));
		library.add(new Book("Vue", "5","Roshan Book House", 900));
		library.add(new Book("Vannila", "6","Roshani Book House", 7000));
		
		library.stream()
		.filter(e -> e.price > 5000)
		.forEach(e -> System.out.println(e.bookName+" has price: "+ e.price));
		
	}

}

class Book{
	String bookId, bookName, publisher;
	int price;
	
	public Book(String bookName, String bookId, String publisher, int price) {
		this.bookName = bookName;
		this.bookId = bookId;
		this.publisher = publisher;
		this.price = price;
	}
	
}