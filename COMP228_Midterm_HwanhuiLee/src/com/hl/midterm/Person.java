package com.hl.midterm;

public abstract class Person {
	protected final int personId;
	protected String name;
	protected String phoneNumber;
	protected static int personCount = 0;
	
	public Person(int personId, String name, String phoneNumber) {
		this.personId = personId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		personCount++;
	}

	public static int getPersonCount() {
		return personCount;
	}

	public void displayBasicDetails() {
		System.out.println("ID: " + personId + ", Name: " + name + ", Phone: " + phoneNumber);
	}
	
	public abstract String getRoleDescription();
	
	@Override
	public String toString() {
		return "ID: " + personId + ", Name: " + name + ", Phone: " + phoneNumber;
	}
}
