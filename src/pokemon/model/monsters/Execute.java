package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.*;

public class Execute extends Pokemon implements Grass, Psychic
{
	public Execute()
	{
		super(102, "Execute");
	}
	
	public Execute(String name)
	{
		super(102, name);
	}
	
	public Execute(int number, String name)
	{
		super(number, name);
	}
	
	public void psystrike()
	{
		System.out.println("");
	}
	
	public void leafBlade()
	{
		System.out.println("");
	}
	
	public void hypnosis()
	{
		System.out.println("");
	}
}
