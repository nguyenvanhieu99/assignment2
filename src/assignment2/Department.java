package assignment2;

import java.util.ArrayList;
import java.util.List;

public class Department {
	 private String departmentName;
	 private List<Employee> listOfEmployee;
	
	 
	 public Department() {
		 super();
		 listOfEmployee=new ArrayList<Employee>();
		
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	public List<Employee> getListOfEmployee() {
		return listOfEmployee;
	}
	public void setListOfEmployee(List<Employee> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}
	public String dislay() {
		return "Department [departmentName=" + departmentName + ", listOfEmployee=" + listOfEmployee + "]";
	}
	 
	 
	 
}
