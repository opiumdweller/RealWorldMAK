package edu.saintjoe.cs.brianc.realworld;

public class Student {
	private String name;
	private String sports;
	private String gender;
	private int classYr;
	private int age;
	
	// does this student play sports? added
	
	
	
	/* Data members above, methods below */
	
	// Right now a "full data" constructor only
	public Student(String newSports, String newName, String newGender, int newClassYr, int newAge) {
		name = newName;
		gender = newGender;
		classYr = newClassYr;
		age = newAge;
		sports = newSports;
	}

	
	// Accessors and Mutators for the data members
	public void setName(String newName) {
		name = newName;
	}
	public void setSport(String newSport) {
		sport = newSport;
	}
	public String getSport() {
		return sport;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(String newGender) {
		gender = newGender;
	}
	public String getGender() {
		return gender;
	}

	public void setClassYr(int year) {
		classYr = year;
	}
	public int getClassYr() {
		return classYr;
	}
	
	public String toString() {
		return ("Student: " + name + " Gender: " + gender + " Class Year: " + classYr + " Age: " + age + sport + "Sport");
	}
	
	
}
