import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Person p = new Person("Polo", 21);
		System.out.println(p);

		String path = "src/pers.dat";
		ObjectOutputStream ostream = null;
		ObjectInputStream istream = null;

		// Serialization Code
		ostream = new ObjectOutputStream(new FileOutputStream(path));
		ostream.writeObject(p); //Serializing Object
		ostream.close();
		System.out.println("Object Serialized...!!");

		// Deserialization Code
		istream = new ObjectInputStream(new FileInputStream(path));
		Object obj = istream.readObject(); // Deserializing Object
		System.out.println(obj);
		istream.close();

	}
}
