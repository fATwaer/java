package c5;

public class PersonTest {

	public static void main(String[] args) {
		Person[] people = new Person[3];
		
		people[0] = new Student("Maria Morris", "computer science");
		people[1] = new Employee(9000);
		Manager m = new Manager("Lilei", 8000, 2013, 1, 3);
		m.setBonus(200);
		people[2] = m;
		for (Person p : people)
			System.out.println(p.getName()+", "+p.getDescription());
	}

}
