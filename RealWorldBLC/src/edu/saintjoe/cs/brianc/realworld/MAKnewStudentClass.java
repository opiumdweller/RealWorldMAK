package edu.saintjoe.cs.brianc.realworld;

public class MAKnewStudentClass {
	private String height;
	private String hairColor;
	private String race;
	private String religion;
	
	//what is the height, hair color, race, and religion of this person?
	
	public MAKnewStudentClass(String newHeight, String newHairColor, String newRace, String newReligion) {
		height = newHeight;
		hairColor = newHairColor;
		race = newRace;
		religion = newReligion;
		
	public String toString() {
		return ("Student: " + "height" + height + "Hair Color" + hairColor + "Race" + race + "Religion" + religion)
	}
}
