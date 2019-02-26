package pokemon.model.monsters;

import pokemon.model.Pokemon;
import pokemon.model.types.*;

public class Gastly extends Pokemon implements Ghost, Poison
{
	public Gastly()
	{
		super(92, "Gastly");
	}
	
	public Gastly(String name)
	{
		super(92, name);
	}
	
	public Gastly(int number, String name)
	{
		super(number, name);
	}
	
	public void acid()
	{
		System.out.println("");
	}
	
	public void lick()
	{
		System.out.println("");
	}
	
	public void curse()
	{
		System.out.println("");
	}
}
