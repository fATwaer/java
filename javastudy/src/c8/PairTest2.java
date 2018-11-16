package c8;


import java.time.*;
import c5.*;

public class PairTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate[] birthdays = 
			{
					LocalDate.of(1906, 12, 9),
					LocalDate.of(1815, 12, 10),
					LocalDate.of(1903, 12, 03),
					LocalDate.of(1910, 6, 22),
			};
		Pair<LocalDate> mm = ArrayAlg.minmax(birthdays);
		System.out.println("min = "+mm.getFisrt());
		System.out.println("max = "+mm.getSecond());
		
		Employee[] e = 
			{
					new Employee(4000),
					new Employee(2000),
					new Employee(1234),
					new Employee(1001),
			};
		Pair<Employee> ee = ArrayAlg.minmax(e);
		System.out.println("min = "+ee.getFisrt());
		System.out.println("max = "+ee.getSecond());
		
		Student[] t = 
			{
					new Student("John", "bilibili"),
					new Student("Param", "funciton"),
					new Student("Ammy", "EE"),
			};
		//Pair<Student> tt = ArrayAlg.minmax(t);
		// cannot do it because the class Student don't supply
		// the interface Comparable
	}

}
class ArrayAlg
{
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0)
			return null;
		T min = a[0];
		T max = a[0];
		for (int i = 1; i < a.length; i++)
		{
			if (min.compareTo(a[i]) > 0)
				min = a[i];
			if (max.compareTo(a[i]) < 0)
				max = a[i];
		}
		return new Pair<>(min, max);
	}
}