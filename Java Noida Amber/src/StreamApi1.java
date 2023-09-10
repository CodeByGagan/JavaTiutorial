import java.util.Arrays;
import java.util.Collection;
import java.util.stream.*;

public class StreamApi1 {

	public static void main(String[] args) {
		
		Stream<String> stream1 = Stream.empty();
		
		Collection<String> collection1 = Arrays.asList("Red", "Green", "Blue", "Yellow");
		
		Stream<String> stream2 = collection1.stream();
		
		String[] arr = new String[]{"a", "b", "c","Gagan","Ironman","Superman"};
		Stream<String> streamOfArrayFull = Arrays.stream(arr);
		Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
		
		System.out.println(streamOfArrayFull);
		System.out.println(streamOfArrayPart);
		
		Stream.iterate(1,e -> e+1)
		.filter(e -> e%5 == 0)
		.limit(5)
		.forEach(System.out::println);
	
	}

}
