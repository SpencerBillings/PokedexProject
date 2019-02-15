package pokemon.model.monsters;

import pokemon.model.types.*;

public class Persian extends Meowth implements Normal
{
	public Persian()
	{
		super(53, "Persian");
	}
	
	public Persian(String name)
	{
		super(53, name);
	}
	
	public Persian(int number, String name)
	{
		super(number, name);
	}
	
	public void pounce()
	{
		System.out.println("");
	}
	
	public void scratch()
	{
		System.out.println("");
	}
}
