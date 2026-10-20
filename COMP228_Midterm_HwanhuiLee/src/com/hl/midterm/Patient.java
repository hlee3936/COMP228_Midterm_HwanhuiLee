package com.hl.midterm;

public class Patient extends Person {
	private final int patientNumber;
	private int age;
	private String medicalDepartment;
	private double consultationFee;
	protected static int patientCount = 0;
	
	public Patient(int personId, String name, String phoneNumber, int patientNumber, int age, String medicalDepartment,
			double consultationFee) {
		super(personId, name, phoneNumber);
		
		if (age < 0 || age > 150) {
			throw new IllegalArgumentException("Invalid Age");
		}
		if (patientNumber <= 0) {
			throw new IllegalArgumentException("Invalid Patient Number");
		}
		if (medicalDepartment == null || medicalDepartment.trim().isEmpty()) {
            throw new IllegalArgumentException("Medical department can not be empty.");
        }
		if (consultationFee < 0) {
            throw new IllegalArgumentException("Invalid Consultation fee");
        }
		
		this.patientNumber = patientNumber;
		this.age = age;
		this.medicalDepartment = medicalDepartment;
		this.consultationFee = consultationFee;
		patientCount++;
	}
	
	public static int getPatientCount() {
		return patientCount;
	}

	@Override
	public String getRoleDescription() {
		return "Patient";
	}
	
	public void displayPatientDetails() {
		System.out.println("Patient Number: " + patientNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + medicalDepartment);
        System.out.println("Registration Status: Successful");
	}
	
	public void registerPatient(String name, int age) {
		System.out.println("Register Patient - Name: " + name + ", Age: " + age);
	}
	
	public void registerPatient(String name, int age, String department) {
		System.out.println("Register Patient - Name: " + name + ", Age: " + age + ", Department: " + department);
	}
}
