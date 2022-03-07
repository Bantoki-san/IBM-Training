import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StringDemo2 {
	public static void main(String[] args) {
		List<String> basket = Arrays.asList("Mango", "Banana", "Apple", "Papaya", "Orange");
		basket.forEach(System.out::println);

		System.out.println();// Just to make a space between O/Ps

		basket.stream().forEach(System.out::println);

		System.out.println();// Just to make a space between O/Ps

		Stream<String> str = Stream.of("Mango", "Banana", "Apple", "Papaya", "Orange");
//		str.sorted().forEach(System.out::println);

		System.out.println();// Just to make a space between O/Ps

//		str.map(s -> s.toUpperCase()).forEach(System.out::println);
		
		System.out.println();// Just to make a space between O/Ps
		
		str.filter(s -> s.contains("a")).forEach(System.out::println);

	}
}
