package assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DepartmentManage implements Config {
	private ArrayList<Department> listDepartment;
	public boolean checkBirthFormat(String date) {
		//String str=  "/d/d[-/.]/d/d[-/.]/d{4}";
		String str="^([0-2][0-9]|(3)[0-1])(\\/)(((0)[0-9])|((1)[0-2]))(\\/)\\d{4}$";
		 if (Pattern.compile(str).matcher(date).matches()) {
		        System.out.println("yes");
		        return true;
		    } else {
		        System.out.println("no");
		    } 
	
		return false;
	}

	public boolean checkPhone(String phone) {
		String str=  "(84|0[3|5|7|8|9])+([0-9]{8})\\b";

		 if (Pattern.compile(str).matcher(phone).matches()) {
		        System.out.println("yes");
		        return true;
		    } else {
		        System.out.println("no");
		    } 
		return false;
	}

	public boolean checkEmail(String mail) {
		String str=  "\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b";

		 if (Pattern.compile(str).matcher(mail).matches()) {
		        System.out.println("yes");
		        return true;
		    } else {
		        System.out.println("no");
		    } 
		return false;	
	

	}

	public void createEmployee() {
		Scanner scanf = new Scanner(System.in);
		System.out.print("\n Enter first Name : ");
		String firstName = scanf.nextLine();
		System.out.print("\n Enter last Name : ");
		String lastName = scanf.nextLine();
		System.out.print("\n Enter ssn of employee : ");
		String ssn = scanf.nextLine();
		System.out.print("\n Enter birth day : ");
		String birthDate = scanf.nextLine();
		while(!checkBirthFormat(birthDate)) {
			birthDate = scanf.nextLine();
		}
		System.out.print("\n Enter phone : ");
		String phone = scanf.nextLine();
		while(!checkPhone(phone)) {
			phone = scanf.nextLine();
		}
		System.out.print("\n Enter type mail : ");
		String mail = scanf.nextLine();
		while(!checkEmail(mail)) {
			mail = scanf.nextLine();
		}
		System.out.print("\n Enter type of employee : ");
		Employee term=null;
		int typeOfEmployee = scanf.nextInt();
		if (typeOfEmployee == HOURLYEMPLOYEE) {
			System.out.print("\n Enter wage : ");
			double wage = scanf.nextDouble();
			System.out.print("\n Enter work hour: ");
			double workHours = scanf.nextDouble();
			term = new HourlyEmployee(wage, workHours);
			
		} else {
			
			System.out.print("\n Enter commission rate : ");
			double commitssionRate = scanf.nextDouble();
			System.out.print("\n Enter grossSales : ");
			double grossSales = scanf.nextDouble();
			System.out.print("\n Enter bassicSalary : ");
			double bassicSalary = scanf.nextDouble();
			term = new SalariedEmployee(commitssionRate, grossSales, bassicSalary);
			
		}
		
		System.out.print("\n Enter Department :\n" + "0:it "+ "1:hr"+ "2:other");
		int  department = scanf.nextInt();
		while(department>listDepartment.size()) {
			System.out.print("there are not department :"+department);
			 department = scanf.nextInt();
		}
		term.setFirstName(firstName);
		term.setLastName(lastName);
		term.setSsn(ssn);
		term.setBirthDate(birthDate);
		term.setEmail(mail);
		term.setPhone(phone);
		listDepartment.get(department).getListOfEmployee().add(term);
		
	}

	public DepartmentManage() {
		listDepartment=new ArrayList<Department>();
		Department department1=new Department();
		department1.setDepartmentName("hr");
		listDepartment.add(department1);
		Department department2=new Department();
		department2.setDepartmentName("it");
		listDepartment.add(department2);
		Department department3=new Department();
		department3.setDepartmentName("orther");
		listDepartment.add(department3);
		Scanner scanf = new Scanner(System.in);
		int pick = 1;
		while (pick != EXIT) {
			System.out.print("Enter number follow menu below:  \n");
			System.out.print("1 - Create employee   \n");
			System.out.print("2 - View all employee  \n");
			System.out.print("3 - Classify employee  \n");
			System.out.print("4 - Search  \n");
			System.out.print("5 - Report  \n");
			System.out.print("0 - exit  \n");
			System.out.print("Pick one :  ");
			pick = scanf.nextInt();

			switch (pick) {
			case CREATEEMPLOYEE: {
				createEmployee();

				break;
			}

			case VIEWEMPLOYEE:{
				viewAllEmployee();
				break;
			}
				
			case CLASSIFYEMPLOYEE:{
				classifyEmployee();
				break;
			}
			case SEARCH:{
				search();
				break;
			}
			case REPORT:{
				break;
			}

			}
		}

	}

	private void search() {
		Scanner scanf = new Scanner(System.in);
		System.out.print("\n Enter Department: ");
		String firstName = scanf.nextLine();
		
		// TODO Auto-generated method stub
		
	}

	private void classifyEmployee() {
		System.out.print("Hour Employee:  \n");
		for(Department department : listDepartment) {
			for(Object employee: department.getListOfEmployee()) {
				if(employee instanceof HourlyEmployee) {
					((HourlyEmployee) employee).Display();
				}
			}
		}
		System.out.print("Salaried Employee:  \n");
		for(Department department : listDepartment) {
			for(Object employee: department.getListOfEmployee()) {
				if(employee instanceof SalariedEmployee) {
					((HourlyEmployee) employee).Display();
				}
			}
		}
		// TODO Auto-generated method stub
		
	}

	private void viewAllEmployee() {
		for(Department department : listDepartment) {
			for(Employee employee: department.getListOfEmployee()) {
				employee.Display();
			}
		}
		
	}
}
