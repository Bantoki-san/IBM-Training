package p2;

public class Sample1 {
	void sayHello() {
		System.out.println("Hello");
	}

	static void sayBye() {
		System.out.println("Byee Byeee!!Take careee...!!!");
	}

	public static void main(String[] args) {
		// sayHello
		Sample1 obj = new Sample1();
		obj.sayHello();

		// saybye
		Sample1.sayBye();
	}

}
