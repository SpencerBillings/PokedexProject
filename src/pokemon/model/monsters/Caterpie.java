package pokemon.model.monsters;

import pokemon.model.types.*;

public class Caterpie extends Pokemon implements Bug
{
	public Caterpie()
	{
		super(10, "Caterpie");
	}
	
	public Caterpie(String name)
	{
		super(10, name);
	}
	
	public Caterpie(int number, String name)
	{
		super(number, name);
	}
	
	public void crawl()
	{
		System.out.println("");
	}
	
	public void pest()
	{
		System.out.println("");
	}
}
