package edu.mu.petmonitor.userprofile;

public class Pet {
	
	private String name;
	private final int numberOfLegs = 8;
	
	public Pet(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}


}
