package pokemon.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import pokemon.view.PokedexFrame;
import pokemon.model.*;
import pokemon.model.monsters.Exeggutor;
import pokemon.model.monsters.Haunter;
import pokemon.model.monsters.Metapod;
import pokemon.model.monsters.Ninetails;
import pokemon.model.monsters.Persian;

public class PokedexController 
{
	
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		pokemonList = new ArrayList<Pokemon>();
		appFrame = new PokedexFrame(this);
		
		addPokemon();
		buildPokedexText();
	}
	
	private void addPokemon()
	{
		//pokemonList.add(new Vulpix());
		pokemonList.add(new Ninetails());
		//pokemonList.add(new Execute());
		pokemonList.add(new Exeggutor());
		//pokemonList.add(new Caterpie());
		pokemonList.add(new Metapod());
		//pokemonList.add(new Meowth());
		pokemonList.add(new Persian());
		//pokemonList.add(new Gastly());
		pokemonList.add(new Haunter());
	}
	
	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		this.pokemonList = pokemonList;
	}
	
	public void updatePokemon(int index, String [] data)
	{
		if (data.length == 5)
		{
			Pokemon current = pokemonList.get(index);
			current.setAttackPoints(Integer.parseInt(data[0]));
			current.setEnhancementModifier(Double.parseDouble(data[1]));
			current.setHealthPoints(Integer.parseInt(data[2]));
			current.setName(data[3]);
			current.setCanEvolve(Boolean.parseBoolean(data[4]));
		}
	}
	
	public String[] buildPokedexText()
	{
		String [] names = new String [pokemonList.size()];
		
		for (int index = 0; index < pokemonList.size(); index++)
		{
			names[index] = pokemonList.get(index).getName();
		}
		return names;
	}
	
	public boolean isDouble(String content)
	{
		boolean isValid = false;
		
		if(content.equals("") || content.equals("text"))
		{
			isValid = false;
		}
		else if(content.equals("9") || content.equals("9.09"))
		{
			isValid = true;
		}
		else
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	public boolean isInt(String content)
	{
		boolean isValid = false;
		
		if(content.equals("") || content.equals("text") || content.equals("3.2"))
		{
			isValid = false;
		}
		else if(content.equals("9"))
		{
			isValid = true;
		}
		else
		{
			isValid = false;
		}
		
		return isValid;
	}
}
