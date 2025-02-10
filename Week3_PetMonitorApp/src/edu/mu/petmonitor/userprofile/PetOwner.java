package edu.mu.petmonitor.userprofile;

import java.util.Arrays;

public class PetOwner {
	
		private String firstname;
		private String lastname;
		private Pet[] pets;
		private static int numOfPets = 0;
		
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
				System.out.println("Sorry you have reached your pet adoption limit");
				return false;
			}
			for(int i=0; i<getPets().length; i++) {
				if(pets[i] == null) {
					pets[i] = pet;
					System.out.println("Congrats " + firstname + "! You have adopted " + pet.getName());
					break;
				}
			}
			numOfPets ++;
			return true;
		}
		
		/**
		 * This method will remove a Pet from the PetOwner object.
		 * 
		 * @param index
		 * 			This arguement will hold the pet
		 * @return
		 * 			Return false if there is an invalid index or, a pet does not exist.
		 * 			Returns true if the remove was successful.
		 */
		
		public boolean removePetAt(int index) {
			if(index < 0 || index > pets.length - 1) {
				System.out.println("Invalid index!");
				return false;
			}
			
			if(pets[index] == null) {
				System.out.println("There is no pet at " + index + " to remove");
				return false;
			}
			
			System.out.println("Removing successful for: " + pets[index]);
			pets[index] = null;
			numOfPets--;
		
			return true;
		}

		@Override
		public String toString() {
			return "PetOwner [firstname=" + firstname + ", lastname=" + lastname + ", pets=" + Arrays.toString(pets)
					+ "]";
		}

		public static int getNumOfPets() {
			return numOfPets;
		}

		public void setNumOfPets(int numOfPets) {
			this.numOfPets = numOfPets;
		}
		
		public void listAdoptedPets() {
			System.out.println(firstname + "'s pets:");
			for(Pet pet : pets) {
				if(pet != null) {
					System.out.println(pet);
				}
			}
		}
		
		public Pet getPetAt(int index) {
			if(pets[index] != null) {
				return new Pet(pets[index]) ;
			}
			return null;
		}
		
}
