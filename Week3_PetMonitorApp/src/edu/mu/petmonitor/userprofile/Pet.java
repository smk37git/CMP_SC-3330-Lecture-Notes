package edu.mu.petmonitor.userprofile;

public class Pet {
	
	private String name;
	private final int numberOfLegs = 8;
	private PetSpecies species;
	
	
	public PetSpecies getSpecies() {
		return species;
	}

	public void setSpecies(PetSpecies species) {
		this.species = species;
	}

	/**
	 * Copy constructor for the pet class
	 * @param pet
	 */
	public Pet(Pet pet) {
		this.name = pet.getName();	
		this.species = pet.getSpecies();
		
	}
	
	public Pet(String name) {
		this.name = name;
		this.species = PetSpecies.CAT;
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
