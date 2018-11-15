package c6;

import java.util.Arrays;

import c5.*;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		
		
		staff[0] = new Employee("Tom", 555000, 2012, 1, 2);
		staff[1] = new Employee("Lisa", 50000, 2030, 1, 3);
		staff[2] = new Employee("Harry", 65000);
		
		Arrays.sort(staff);
		
		for(Employee e : staff)
			System.out.println("name="+e.getName()+",Salary="+e.getSalary());
	
		Comparable x;
		x = new Employee(123);
		if (x instanceof Comparable) 
			System.out.println("true");
		
	}

}
