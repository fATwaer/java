package c5;

public class Manager extends Employee{
	
	private double bonus;
	
	public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus = 0;
	}
	
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double getSalary() {
		return super.getSalary() + bonus;
	}
	
//	//get description
//	public String getDescription() {
//		return String.format("an Manager with a salary of $%.2f", getSalary());
//	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
