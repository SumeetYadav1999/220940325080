package qustion4;

public class child extends Parent {
	public child(String fatherName,String MotherName,String grandFatherName, String grandMotherName) {
		super(fatherName,MotherName,grandFatherName, grandMotherName);
		this.grandFatherName = grandFatherName;
		this.grandMotherName = grandMotherName;
		this.fatherName = fatherName;
		this.MotherName = MotherName;
		System.out.println("Father Name is  "+this.fatherName);
		System.out.println("Mother Name is  "+this.MotherName);
		System.out.println("grand Father Name is  "+this.grandFatherName);
		System.out.println("grand Mother Name is  "+this.grandMotherName);
	}

	
	public static void main(String[] args) {
		child c1 = new child("rohit","sakshi","shubham","jeevika");
		}

	}


