package pokemon.trainer;

import java.util.ArrayList;

import pokemon.monster.Pokemon;

public class PokemonTrainer {
	
	private String name;
	private ArrayList<Pokemon> pokemonList;
	
	public PokemonTrainer(String name) {
		this.name = name;
		this.pokemonList = new ArrayList<Pokemon>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Pokemon> getPokemonList() {
		return pokemonList;
	}

	public void setPokemonList(ArrayList<Pokemon> pokemonList) {
		this.pokemonList = pokemonList;
	}
	

}
