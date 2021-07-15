package assignment2;

public abstract class Employee implements Payable{
	protected String ssn;
	protected String firstName;
	protected String lastName;
	protected String birthDate;
	protected String phone;
	protected String email;
	
	public Employee() {
		super();
	}
	public Employee(String ssn, String firstName, String lastName) {
		super();
		this.ssn = ssn;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getSsn() {
		return ssn; 
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void Display() {
		System.out.print( "Employee [ssn=" + ssn + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + ", phone=" + phone + ", email=" + email + "] \n");
	}
	
	
	
}
