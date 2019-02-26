package pokemon.controller;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import pokemon.view.PokedexFrame;
import pokemon.model.Pokemon;
import pokemon.model.monsters.*;


public class PokedexController 
{
	private String saveFile = "backup.pokemon";
	private ArrayList<Pokemon> pokemonList;
	private PokedexFrame appFrame;
	
	public PokedexController()
	{
		this.pokemonList = new ArrayList<Pokemon>();
		this.appFrame = new PokedexFrame(this);
		
		addPokemon();
		buildPokedexText();
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
		pokemonList.add(new Gastly());
		pokemonList.add(new Haunter());
		pokemonList.add(new Hmmm());
	}
	
	public void start()
	{
		
	}
	
	public ArrayList<Pokemon> getPokemonList()
	{
		return pokemonList;
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
	
	public String toString()
	{
		
	}
	
	public String getPokemonTypes()
	{
		
	}
	
	public void savePokedex()
	{
		try
		{
			FileOutputStream saveStream = new FileOutputStream(saveFile);
			ObjectOutputStream output = new ObjectOutputStream(saveStream);
			output.writeObject(pokemonList);
			output.close();
			saveStream.close();
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, error.getMessage(), "File Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void loadPokedex()
	{
		try
		{
			ArrayList<Pokemon> saved = new ArrayList<Pokemon>();
			FileInputStream inputStream = new FileInputStream(saveFile);
			ObjectInputStream input = new ObjectInputStream(inputStream);
			saved = (ArrayList<Pokemon>) input.readObject();
			input.close();
			inputStream.close();
			pokemonList = saved;
		}
		catch(IOException error)
		{
			JOptionPane.showMessageDialog(appFrame, "No Save File", "Loading Pokemon", JOptionPane.INFORMATION_MESSAGE);
		}
		catch(ClassNotFoundException pokemonError)
		{
			JOptionPane.showMessageDialog(appFrame,  pokemonError.getMessage(), "Type Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public PokedexFrame getFrame()
	{
		return appFrame;
	}
}
