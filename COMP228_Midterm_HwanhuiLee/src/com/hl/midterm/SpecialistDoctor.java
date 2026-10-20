package com.hl.midterm;

public class SpecialistDoctor extends Doctor {
	private final String specialization;
	private final double specialistSurcharge;
	
	public SpecialistDoctor(int personId, String name, String phoneNumber, int staffId, String department,
			double monthlySalary, double consultationFee, int patientSeen, String specialization,
			double specialistSurcharge) {
		super(personId, name, phoneNumber, staffId, department, monthlySalary, consultationFee, patientSeen);
		this.specialization = specialization;
		this.specialistSurcharge = specialistSurcharge;
	}
	
	@Override
	public double calculateConsultationFee() {
		return consultationFee + specialistSurcharge;
	}
	
	@Override
	public void displayStaffDetails() {
		System.out.println("Staff ID: " + staffId);
        System.out.println("Name: Dr. " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: $" + String.format("%.2f", calculateConsultationFee()));
	}
	
	@Override
	public double calculateMonthlyCompensation() {
		return monthlySalary + (patientSeen * 7);
	}
}
