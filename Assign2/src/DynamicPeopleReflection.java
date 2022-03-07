import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicPeopleReflection {
	public static void main(String[] args) throws Exception{
		//Manually Load Class
		Class pc = Class.forName("People");
		System.out.println(pc.getName());
		
		//Getting Deafult Constructor
		Constructor c1 = pc.getConstructor(null);
		//Instatntiate Class with Default Constructor
		Object p1 = c1.newInstance(null);
		System.out.println(p1);
		
		//setting Parameterised Constructor
		Constructor c2 = pc.getConstructor(String.class);
		//Instantiating with parameterized constructor
		Object p2 = c2.newInstance("Veena");
		System.out.println(p2);
		
		//Getting Print Method
		Method m1 = pc.getDeclaredMethod("print", null);
		//Invoking Method on p2 object
		m1.invoke(p2, null);
	}
}
