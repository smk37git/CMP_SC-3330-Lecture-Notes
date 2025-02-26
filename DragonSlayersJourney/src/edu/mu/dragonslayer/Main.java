package edu.mu.dragonslayer;

import edu.mu.dragonslayer.characters.Dragon;
import edu.mu.dragonslayer.characters.DragonSlayer;
import edu.mu.dragonslayer.characters.DragonType;
import edu.mu.dragonslayer.strategy.SpellStrategy;

public class Main {

	public static void main(String[] args) {
		
		DragonSlayer slayer = new DragonSlayer("Toby");
		Dragon joe = new Dragon(1, "Joe", DragonType.SILVER_DRAGON);

		slayer.attack(joe);
		slayer.changeStrategy(new SpellStrategy());
		System.out.println(joe);
		//slayer.attack(joe);
		
	}

}
