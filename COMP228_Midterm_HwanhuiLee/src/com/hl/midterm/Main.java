package com.hl.midterm;

public class Main {

	public static void main(String[] args) {
		//PATIENT REGISTRATION
		System.out.println("PATIENT REGISTRATION");
		//int personId, String name, int phoneNumber, int patientNumber, int age, String medicalDepartment, double consultationFee
		Patient p1 = new Patient(0001, "Amy", "4161111111", 1001, 21, "Cardiology", 1000);
		p1.displayPatientDetails();
		System.out.println();
		
		Patient p2 = new Patient(0002, "Bob", "4162222222", 1002, 22, " General Medicine", 2000);
		p2.displayPatientDetails();
		
		//DOCTOR DETAILS
		System.out.println("\nDOCTOR DETAILS");
		//int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary, double consultationFee, int patientSeen
		Doctor d1 = new Doctor(0003, "Chris", "4163333333", 2001, "Cardiology", 9000, 150, 100);
		d1.displayStaffDetails();
		
		//SPECIALIST DOCTOR DETAILS
		System.out.println("\nSPECIALIST DOCTOR DETAILS");
		//int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary, 
		//double consultationFee, int patientSeen, String specialization, double specialistSurcharge
		SpecialistDoctor sd1 = new SpecialistDoctor(0004, "Don", "4164444444", 2002, "Cardiology", 9000, 200, 50, "Neurology", 300);
		sd1.displayStaffDetails();
		
		//NURSE DETAILS
		System.out.println("\nNURSE DETAILS");
		//int personId, String name, String phoneNumber, int staffId, String department, double monthlySalary, String shiftType, double shiftAllowance
		Nurse n1 = new Nurse(0005, "Eve", "4165555555", 2003, "Emergency", 7000, "Night", 500);
		n1.displayStaffDetails();
		
		//CONSULTATION FEE CALCULATIONS
		System.out.println("\nCONSULTATION FEE CALCULATIONS");
		System.out.println("Standard Consultation Fee: $" + d1.calculateConsultationFee());
        System.out.println("Consultation Fee After Discount: $" + d1.calculateConsultationFee(15));
        System.out.println("Consultation Fee With Additional Charge: $" + d1.calculateConsultationFee(15, 40));
		
		//REGISTRATION SUMMARY
		System.out.println("\nREGISTRATION SUMMARY");
		System.out.println("Total People: " + Person.getPersonCount());
        System.out.println("Total Patients: " + Patient.getPatientCount());
        System.out.println("Total Medical Staff: " + MedicalStaff.getStaffCount());
        
        //RUNTIME POLYMORPHISM
        System.out.println("\nRUNTIME POLYMORPHISM");
        MedicalStaff[] staffArray = { d1, sd1, n1 };
        for (MedicalStaff staff : staffArray) {
        	System.out.println("Role: " + staff.getRoleDescription());
            staff.displayStaffDetails();
            System.out.println("Monthly Compensation: $" + staff.calculateMonthlyCompensation());
            System.out.println();
        }
	}

}
