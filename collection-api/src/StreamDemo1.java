import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo1 {
	public static void main(String[] args) {
		Integer[] ar = { 2, 5, 7, 6, 8, 2, 3, 4 };
		// Convert An Array into a List of Integers
		List<Integer> numbers = Arrays.asList(ar);

		// New way to iterate over collection
//		numbers.forEach(System.out::println);

		// Creating Stream for numbers List
//		Stream<Integer> str1 = numbers.stream();
//		str1.forEach(System.out::println);
		// Performing the operation again will give an error as Stream is closed
//		str1.forEach(System.out::println);

		// Shorthand to do the same
		numbers.stream().forEach(System.out::println); // forEach is terminal operator
		System.out.println();// Just to add spaces between the O/Ps

		// Performing Intermediate Operation
		numbers.stream().distinct().forEach(System.out::println); // distinct() is intermediate operator
		System.out.println();// Just to add spaces between the O/Ps

		System.out.println(numbers.stream().distinct().count()); // count() is terminal operator
		System.out.println();// Just to add spaces between the O/Ps

		numbers.stream().distinct().sorted().forEach(System.out::println); // sorted is intermediate operator
		System.out.println();// Just to add spaces between the O/Ps

		// Calculate Sum in 2 different ways
		System.out.println(numbers.stream().distinct().reduce(0, (a, b) -> a + b));
		System.out.println(numbers.stream().distinct().reduce(0, Integer::sum));
		System.out.println();// Just to add spaces between the O/Ps

		// Creating and working with Streams of Number
		System.out.println(IntStream.range(1, 99).count());
		System.out.println(IntStream.range(1, 9).sum());

		System.out.println(IntStream.range(1, 9).skip(5).sum());
		System.out.println();// Just to add spaces between the O/Ps

		// Common Statistics on Integer Stream
		IntStream str = IntStream.of(2, 5, 7, 6, 8, 2, 3, 4);
		IntSummaryStatistics stats = str.summaryStatistics();
		System.out.println(stats);

	}
}
