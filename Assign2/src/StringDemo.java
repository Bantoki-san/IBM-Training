
public class StringDemo {

	public static void main(String[] args) {
		String s1 = "Hello";// Stored in String Pool
		String s2 = new String("Hello");// stored in Heap
		String s3 = "Hello";

		System.out.println(s1);

		// Compares memory Locations
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		// Compares values
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

		s1 = s1 + "World"; // Manipulating String
		System.out.println(s1);
		System.out.println(s1 == s3);// Now the memory Location has changed and will return false

		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

		System.out.println(s1.indexOf('o'));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.charAt(5));

		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 3));
	}

}
