package edu.mu.petmonitor;

import edu.mu.petmonitor.userprofile.Pet;
import edu.mu.petmonitor.userprofile.PetOwner;

public class Main {

	public static void main(String[] args) {
		
		PetOwner owner = new PetOwner();
		System.out.println("Name: " + owner.getFirstname());
		
		PetOwner ownerWithName = new PetOwner("Ekincan", "Ufuktepe");
		System.out.println("Name: " + ownerWithName.getFirstname());
		
		for(int i=0; i<10; i++) {
			ownerWithName.adoptPet(new Pet("Peanut"));
		}
		
		ownerWithName.removePetAt(0);
		ownerWithName.listAdoptedPets();
		
		System.out.println("Owner: " + owner.getFirstname() + " has " + owner.getNumOfPets() + "number of pets");

	}

}
