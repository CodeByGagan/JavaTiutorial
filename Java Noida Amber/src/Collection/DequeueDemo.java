package Collection;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueDemo {

	public static void main(String[] args) {

//		Deque<String> d1 = new ArrayDeque<String>();
//		
//		d1.add("Red");
//		d1.add("Blue");
//		d1.add("Green");
//		d1.add("Black");
//		d1.add("White");
//		
//		System.out.println(d1);
//		
//		d1.push("Gray");
//		System.out.println(d1);
//		
//		d1.offerFirst("Cyan");
//		System.out.println(d1);
//		
//		d1.poll();
//		System.out.println(d1);
//		
//		for(String str:d1) {
//			System.out.println(str);
//		}
		
		Deque<Book> library = new ArrayDeque<Book>();
		Book b1 = new Book(11, "Learn Java", "Mohan", "Mohan Book house");
		Book b2 = new Book(22,  "Learn React", "Sohan", "Sohan Book house");
		Book b3 = new Book(33,  "Learn CSS", "Rohan", "Rohan Book house");
		Book b4 = new Book(44,  "Learn HTML", "Shyam", "Shyam Book house");
		
		library.add(b1);
		library.add(b2);
		library.add(b3);
		library.add(b4);
		
		for(Book b:library) {
			System.out.println(b.id+", "+b.bookName+", "+b.author+", "+b.publisher);
		}
		
	}

}

class Book{
	
	int id;
	String bookName, author, publisher;
	
	Book(int id, String bookName, String author, String publisher){
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.publisher = publisher;
	}
	
}