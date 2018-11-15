package c5;
import java.time.*;

public class Employee extends Person implements Comparable<Employee>{
//	private final String name;
	private double salary;
	private LocalDate hireDay;
	private int id = assignID();
	private static int nextID;
	
	
	{
		hireDay = LocalDate.now();
	}
	
	
	static 
	{
		nextID = 1;
	}
	
	public Employee() {
		this(0);
	}
	
	public Employee(double s) {
		this("Employee #"+nextID, s);
	}
	
	public Employee(String n, double s) {
		super(n);
		salary = s;
	}
	
	public Employee(String n, double s, int year, int month, int day) {
		super(n);
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	private int assignID() {
		int r = nextID;
		nextID++;
		return r;
	}
	
	public int getID() {
		return id;
	}
	
//	public String getName() {
//		return name;
//	}
	
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
	

	
	// equals 
	public boolean equals(Object otherObject) {
		if (this == otherObject) 
			return true;
		if (otherObject == null) 
			return false;
		System.out.println(getClass());
		if (getClass() != otherObject.getClass())
			return false;
		
		Employee other = (Employee)otherObject;
		
		return name.equals(other.name)
			&& salary == other.salary
			&& hireDay.equals(other.hireDay);
		
	}
	
	//get description
	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", getSalary());
	}
	
	//hash code
	public int hashcode() {
		return 7 * name.hashCode()
			+ 11 * new Double(salary).hashCode()
			+ 13 * hireDay.hashCode();
	}
	
	
	// toString
	public String toString() {
		return "Employee[name=" + name
			+ ",salary=" + salary
			+ ",hireDay" + hireDay
			+ "]";
	}
	
	//compare
	public int compareTo(Employee other) {
		return Double.compare(this.getSalary(), other.getSalary());
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
