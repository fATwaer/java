package c5;
import java.time.*;

class Employee {
	private final String name;
	private double salary;
	private LocalDate hireDay;
	
	private static int nextID = 1;
	
	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
		nextID++;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public LocalDate getHireDay() {
		return hireDay;
	}
	
	public void raiseSalary(double bypersent) {
		double raise = salary * bypersent/ 100;
		salary += raise;
	}
	
	
	public static int getNextId() {
		return nextID;
	}
	
	public static void main(String[] args) {
		Employee staff = new Employee("Tony test", 9900, 2018, 11, 14);
		double salary = staff.getSalary();
		System.out.println(salary);
		System.out.println(Employee.nextID);
		staff.raiseSalary(100);
		salary = staff.getSalary();
		System.out.println(salary);

	}

}
