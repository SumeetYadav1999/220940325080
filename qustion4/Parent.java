package qustion4;

public class Parent extends GrandParent {
String fatherName;
String MotherName;
public Parent(String grandFatherName, String grandMotherName, String fatherName, String motherName) {
	super(grandFatherName, grandMotherName);
	this.grandFatherName = grandFatherName;
	this.grandMotherName = grandMotherName;
	this.fatherName = fatherName;
	this.MotherName = motherName;
	System.out.println("Father Name is  "+this.fatherName);
	System.out.println("Mother Name is  "+this.MotherName);
}

public Parent(String grandFatherName, String grandMotherName) {
	super(grandFatherName, grandMotherName);
	this.grandFatherName = grandFatherName;
	this.grandMotherName = grandMotherName;
	System.out.println("Father Name is  "+this.grandFatherName);
	System.out.println("Mother Name is  "+this.grandMotherName);
}

}
