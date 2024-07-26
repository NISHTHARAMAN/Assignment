package com.nishtha.assignment.employees;

public class Developer extends Employee{

	private String skills;
	
	public Developer(String name, int employeeId, int salary,String skills) {
		super(name, employeeId, salary);
		this.skills=skills;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	

	

	
	
	
}
