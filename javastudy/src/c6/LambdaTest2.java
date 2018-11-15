package c6;

import java.util.Arrays;
import java.util.Comparator;
import c5.*;


public class LambdaTest2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] people = new Employee[3];
		
		people[0] = new Employee("ammy", 2000);
		people[1] = new Employee("wuda", 3000);
		people[2] = new Employee("ada", 2500);
		
		for (Person e: people)
			System.out.println("name: " + e.getName());
		System.out.println();
		
		Arrays.sort(people);
		for (Person e: people)
			System.out.println("name: " + e.getName());
		System.out.println();
		
		Arrays.sort(people, Comparator.comparing(Person::getName, (s, t)->Integer.compare(s.length(), t.length())));
		for (Person e: people)
			System.out.println("name: " + e.getName());
		System.out.println();
	}

}
