package com.hl.midterm;

public class Nurse extends MedicalStaff {
	private final String shiftType;
	private final double shiftAllowance;
	
	public Nurse(int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary,
			String shiftType, double shiftAllowance) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}
	
	@Override
	public double calculateMonthlyCompensation() {
		return monthlySalary + shiftAllowance;
	}
	
	@Override
	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shiftType);
        System.out.println("Monthly Compensation: $" + String.format("%.2f", calculateMonthlyCompensation()));
	}
	
	@Override
	public String getRoleDescription() {
		return "Nurse";
	}
}
