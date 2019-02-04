package pokemon.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import pokemon.model.*;

public class PokedexController 
{
	
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		appFrame = new PokedexFrame(this);
		
		addPokemon();
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
