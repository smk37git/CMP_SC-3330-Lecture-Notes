package edu.mu.fitnessapp.user;

public class FitnessUser {
	
	private String firstname;
	private String lastname;
	private int steps;
	
	// Getter and Setter methods
	
	// First Name
	// Boolean Return = more control
	public boolean setFirstname(String firstname) {
		if(firstname.contains("fuk")) {
			this.firstname = null;
			System.err.println("Your firstname contains profane language.");
			return false;
		}
		this.firstname = firstname;
		return true;
	}
	
	public String getFirstname() {
		return firstname;
	}

	
	// Last Name
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	// Steps
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
	
	// Walking
	public boolean incrementSteps(int stepSize) {
		if(stepSize == 0) {
			return false;
		}
		steps += Math.abs(stepSize);
		return true;
	}
	
	
	// Print User Info
	@Override
	public String toString() {
		return "FitnessUser [firstname=" + firstname + ", lastname=" + lastname + ", steps=" + steps + "]";
	}
	
	// Check to see if User's are equal
	@Override
	public boolean equals(Object obj) {
		FitnessUser user = (FitnessUser)obj;
		if(this.firstname.equals(user.getFirstname()) &&
				this.lastname.equals(user.getLastname())) {
			return true;
		}
		return false;
	}
	
	
	

}
