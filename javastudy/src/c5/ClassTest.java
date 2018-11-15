package c5;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Employee e = new Employee(1000);
		Class c1 = e.getClass();
		System.out.println(c1.getName()+" "+e.getName());
		
		String className = "java.util.Random";
		Class c2 = Class.forName(className);
		System.out.println(c2.getName());
		
		Object m = Class.forName(className).newInstance();
		
	}
}
