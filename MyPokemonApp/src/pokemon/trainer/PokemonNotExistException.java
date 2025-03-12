package pokemon.trainer;

import pokemon.monster.Pokemon;

public class PokemonNotExistException extends Exception {
	
	private Pokemon offendingPokemon = null;

	public PokemonNotExistException(Pokemon p) {
		super();
		this.offendingPokemon  = p;
		System.err.println("Pokemon: " + p + " is not in list!");
	}

	public Pokemon getOffendingPokemon() {
		return offendingPokemon;
	}
}
