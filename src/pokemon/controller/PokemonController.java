package pokemon.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import pokemon.view.PokemonFrame;
import pokemon.model.*;

public class PokemonController 
{
	
	private ArrayList<Pokemon> pokemonList;
	private PokemonFrame appFrame;
	
	public PokemonController()
	{
		pokemonList = new ArrayList<Pokemon>();
		addPokemon();
		appFrame = new PokemonFrame(this);
	}
	
	private void addPokemon()
	{
		pokemonList.add(new Vulpix());
		pokemonList.add(new Ninetails());
		pokemonList.add(new Execute());
		pokemonList.add(new Exeggutor());
		pokemonList.add(new Caterpie());
		pokemonList.add(new Metapod());
		pokemonList.add(new Meowth());
		pokemonList.add(new Persian());
	}
	
	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		
	}
	
}
