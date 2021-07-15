package assignment2;

public class HourlyEmployee extends Employee {
	private double wage;
	private double workHours;
	
	public HourlyEmployee(String ssn, String firstName, String lastName) {
		super(ssn, firstName, lastName);
	}
	public HourlyEmployee(double wage, double workHours) {
		super();
		this.wage = wage;
		this.workHours = workHours;
	} 
	
	public HourlyEmployee() {
		super();
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getWorkHours() {
		return workHours;
	}
	public void setWorkHours(double workHours) {
		this.workHours = workHours;
	}
	
	
}
