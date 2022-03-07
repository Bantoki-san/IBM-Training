
public class Car {
	private String model;
	private String[] features;
	
	//It can only be the last parameter of the method
	public Car(String model, String... features) {//var-args
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Features of Model: " + model);
		for(String f : features)
			System.out.println(" - " + f);
	}
	
	public static void main(String[] args) {
		Car alto = new Car("Suzuki Alto", "AC", "Music System");
		alto.specs();
		
		Car astor = new Car("MG Astor", "Keyless", "AC", "Power Window", "Music system");
		astor.specs();
	}
	
	
	
}
