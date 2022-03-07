@FunctionalInterface
public interface Hello {
	String sayHello();

	default String sayBye() {
		return "goodbye";
	}
	
	static void greetings() {
		System.out.println("Happy Holidays");
	}
}
