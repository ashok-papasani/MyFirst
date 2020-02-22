package com.Exposurenew.app.Information;

public class EmployeeDetails {
	private String empname;
	private int age;
	
	 public EmployeeDetails(String empname) {
		
		this.empname = empname;
	}



	EmployeeDetails(String empname, int age) {
		
		this.empname = empname;
		this.age = age;
	}

	

	public String getEmpname() {
		return empname;
	}
	
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "[empname=" + empname + ", age=" + age + "]";
	}
}
