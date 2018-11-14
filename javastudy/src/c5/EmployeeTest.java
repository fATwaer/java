package c5;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tom", 40000, 2012, 1, 2);
		staff[1] = new Employee("Lisa", 50000, 2030, 1, 3);
		staff[2] = new Employee("Harry", 65000, 2050, 1, 4);
		
		for (Employee e : staff) 
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
		
	}

}
