package pokemon;

import java.util.ArrayList;
import java.util.Collections;

import pokemon.monster.Pokemon;
import pokemon.monster.PokemonTypes;
import pokemon.trainer.PokemonTrainer;
import pokemon.comparators.PokemonHealthPointComparator;
import pokemon.comparators.PokemonTypeComparator;

public class Main {

	public static void main(String[] args) {
		PokemonTrainer ash = new PokemonTrainer("Ash");
		System.out.println(ash.getPokemonList());
		ash.getPokemonList().add(new Pokemon("Pikachu", PokemonTypes.ELECTRIC, 50, 20.0));
		ash.getPokemonList().add(new Pokemon("Squirtle", PokemonTypes.WATER, 100, 75.0));
		ash.getPokemonList().add(new Pokemon("Mewtwo", PokemonTypes.PSYCHIC, 200, 100.0));
		ash.getPokemonList().add(new Pokemon("Snorlax", PokemonTypes.NORMAL, 150, 60.0));
		ash.getPokemonList().add(new Pokemon("Charizard", PokemonTypes.FIRE, 120, 80.0));
		
		//ash.getPokemonList().sort(null);
		Collections.sort(ash.getPokemonList(), new PokemonTypeComparator());
		Collections.sort(ash.getPokemonList());
		for(Pokemon p : ash.getPokemonList()) {
			System.out.println(p);
		}
		//System.out.println(ash.getPokemonList());
		
		
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(5);
		intList.add(7);
		intList.add(1);
		intList.add(2);
		intList.add(9);
		intList.add(3);
		//System.out.println(intList);
		//intList.sort(null);
		Collections.sort(intList);
		//System.out.println(intList);
		
	}

}
