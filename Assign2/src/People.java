
public class People {

	private String name;

	public People() {
		name = "Anonymous";
	}

	pubic People(String name) {
		this.name;
	}

	@Override
	public String toString() {
		return "People [name=" + name + "]";
	}

	public void print() {
		System.out.println("Name : " + name);
	}

}
