package assignment2;

public class SalariedEmployee extends Employee{
	private double commitssionRate ;
	private  double  grossSales;
	private double bassicSalary;
	
	
	public SalariedEmployee() {
		super();
	}
	
	public SalariedEmployee(String ssn, String firstName, String lastName) {
		super(ssn, firstName, lastName);
		
	}

	public SalariedEmployee(double commitssionRate, double grossSales, double bassicSalary) {
		super();
		this.commitssionRate = commitssionRate;
		this.grossSales = grossSales;
		this.bassicSalary = bassicSalary;
	}
	public double getCommitssionRate() {
		return commitssionRate;
	}
	public void setCommitssionRate(double commitssionRate) {
		this.commitssionRate = commitssionRate;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getBassicSalary() {
		return bassicSalary;
	}
	public void setBassicSalary(double bassicSalary) {
		this.bassicSalary = bassicSalary;
	}
	
	
	
}
