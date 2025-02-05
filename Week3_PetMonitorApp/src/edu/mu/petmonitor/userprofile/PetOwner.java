package edu.mu.petmonitor.userprofile;

import java.util.Arrays;

public class PetOwner {
	
		private String firstname;
		private String lastname;
		private Pet[] pets;
		private int numOfPets = 0;
		
		public PetOwner() {
			this.firstname = "NO_NAME";
			this.lastname = "NO_NAME";
		}
		
		public PetOwner(String name, String lastname) {
			this.firstname = name;
			this.lastname = lastname;
			this.pets = new Pet[5];
			
		}
		
		public PetOwner(String name, String lastname, int numOfPets) {
			this.firstname = name;
			this.lastname = lastname;
			this.pets = new Pet[numOfPets];
			
		}


		// Getter and Setter methods
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public Pet[] getPets() {
			return pets;
		}
		public void setPets(Pet[] pets) {
			this.pets = pets;
		}
		
		public boolean adoptPet(Pet pet) {
			if(numOfPets == getPets().length) {
				return false;
			}
			pets[numOfPets]= pet;
			numOfPets ++;
			return true;
		}

		@Override
		public String toString() {
			return "PetOwner [firstname=" + firstname + ", lastname=" + lastname + ", pets=" + Arrays.toString(pets)
					+ "]";
		}

		public int getNumOfPets() {
			return numOfPets;
		}

		public void setNumOfPets(int numOfPets) {
			this.numOfPets = numOfPets;
		}
		
		
		
		
}
