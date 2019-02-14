package pokemon.model.monsters;

import pokemon.model.types.*;

public class Metapod extends Caterpie implements Bug
{
	public Metapod()
	{
		super(11, "Metapod");
	}
	
	public Metapod(String name)
	{
		super(11, name);
	}
	
	public Metapod(int number, String name)
	{
		super(number, name);
	}
	
	public void harden()
	{
		System.out.println("Metapod used harden! It's not very effective...");
	}
	
	public void pest()
	{
		System.out.println("");
	}
}
