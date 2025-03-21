package edu.mu.fitnessapp;

import edu.mu.fitnessapp.user.FitnessUser;
import edu.mu.fitnessapp.user.SystemAdministratorUser;

public class Main {

	public static void main(String[] args) {
		
		FitnessUser user1 = new FitnessUser();
		//user1.firstname = "Ekincan";
		//user1.lastname = "Ufuktepe";
		//System.out.println("User #1: " + user1.firstname);
		
		
		// USER 1
		user1.setFirstname("Sebastian");
		user1.setLastname("Main");
		user1.setSteps(0);
		
		System.out.println("Firstname: " + user1.getFirstname());
		System.out.println("Lastname: " + user1.getLastname());
		System.out.println("User Info: " + user1);
		
		// USER 2
		FitnessUser user2 = new FitnessUser();
		user2.setFirstname("Sebastian");
		user2.setLastname("Main");
		user2.setSteps(0);
		
		// Doesn't work, typecast error when checking for .equals
		SystemAdministratorUser admin = new SystemAdministratorUser();
		admin.setLastname("Doe");
		admin.setName("Jane");
		
		if(user1.equals(user2)) {
			System.out.println("You have two same users");
		}
		
		for(int i=0; i <10; i++) {
			user1.incrementSteps(2);
			System.out.println("User #1 Info: " + user1);
		}
		
		
		
		

	}

}
