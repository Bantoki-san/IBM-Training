
public class ChildDemo<S, B> extends Demo<S> {

	private S temp;

	public ChildDemo(S data, B temp) {
		super(data);
		this.temp = temp;
	}

	public B getTemp() {
		return temp;
	}

	public void setTemp(B temp) {
		this.temp = temp;
	}

	public static void main(String[] args) {
		ChildDemo<String, Integer> c1 = new ChildDemo<String, Integer>("Polo", 21);
		System.out.println(c1.getData() + "\t" + c1.getTemp());
	}

}
