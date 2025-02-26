package edu.mu.dragonslayer.characters;

public class Dragon {

	private int HP;
	private String name;
	private DragonType type;
	
	
	public Dragon(int hP, String name, DragonType type) {
		super();
		HP = hP;
		this.name = name;
		this.type = type;
	}


	public int getHP() {
		return HP;
	}


	public void setHP(int hP) {
		HP = hP;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public DragonType getType() {
		return type;
	}


	public void setType(DragonType type) {
		this.type = type;
	}
	
	public String ineffectAttackMessage() {
		return name + "Hahaha... that tickled!";
	}
	
}
