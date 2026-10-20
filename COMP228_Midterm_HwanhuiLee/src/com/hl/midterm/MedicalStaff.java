package com.hl.midterm;

public abstract class MedicalStaff extends Person {
	protected final int staffId;
	protected String department;
	protected double monthlySalary;
	protected static int staffCount = 0;
	
	public MedicalStaff(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary) {
		super(personId, name, phoneNumber);
		this.staffId = staffId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}
	
	public static int getStaffCount() {
		return staffCount;
	}

	public abstract double calculateMonthlyCompensation();
	
	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Monthly Salary: $" + String.format("%.2f", monthlySalary));
	}
	
	@Override
	public String getRoleDescription() {
		return "Medical Staff";
	}
}
