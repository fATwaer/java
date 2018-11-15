package c5;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] staff = new Employee[6];
		
		staff[0] = new Employee("Tom", 40000, 2012, 1, 2);
		staff[1] = new Employee("Lisa", 50000, 2030, 1, 3);
		staff[2] = new Employee("Harry", 65000);
		staff[3] = new Employee(8000);
		staff[5] = new Employee("Lisa", 50000, 2030, 1, 3);
		
		Manager m = new Manager("Tim", 80000, 2000, 12, 1);
		m.setBonus(10);
		staff[4] = m;
		for (Employee e : staff) 
			System.out.println("id="+e.getID()+",name="+e.getName()+
					",salary="+e.getSalary()+",hireDay="+e.getHireDay());
		System.out.println("staff[1] is equal to staff[5]?"+staff[1].equals(staff[5]));
		System.out.println("m is instance of Employee?"+(m instanceof Employee));
//		System.out.println("id="+m.getID()+",name="+m.getName()+
//				",salary="+m.getSalary()+",hireDay="+m.getHireDay());
		
		for (Employee e: staff)
			System.out.println("hash="+e.hashCode()+",toString="+e.toString());
	
	}

}
