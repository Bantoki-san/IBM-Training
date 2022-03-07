import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaDemo {

	public static void print(Object obj) {
		System.out.println(obj);
	}

	public static void checkOdd(int i) {
		System.out.println(i % 2 != 0 ? true : false);
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s);
		c1.accept("Say Hello!!");

		Consumer<String> c2 = System.out::println;
		c2.accept("Bonjour");

		Consumer<String> c3 = LamdaDemo::print;
		c3.accept("Aloha");

		Consumer<Integer> c4 = LamdaDemo::checkOdd;
		c4.accept(9);

		Supplier<String> s1 = () -> "Adios";
		System.out.println(s1.get());

		Supplier<Integer> s2 = () -> (int) (Math.random() * 100);
		System.out.println(s2.get());

		Predicate<Integer> positive = (x) -> x >= 0;
		System.out.println(positive.test(4));
		System.out.println(positive.test(-3));

		Predicate<Integer> even = (x) -> x % 2 == 0;
		System.out.println(even.test(4));
		System.out.println(even.test(3));

		String email = "zubair@gmail.com";
		BiPredicate<String, String> contains = (s, c) -> s.contains(c);
		System.out.println(contains.test(email, "@"));
		System.out.println(contains.test(email, "."));

		Function<Integer, Integer> square = (x) -> x * x;
		System.out.println(square.apply(6));

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		System.out.println(sum.apply(10, 20));

	}
}
