package pokemon.model.monsters;

import pokemon.model.types.*;

public class Ninetails extends Vulpix implements Fire
{
	public Ninetails()
	{
		super(38, "Ninetails");
	}
	
	public Ninetails(String name)
	{
		super(38, name);
	}
	
	public Ninetails(int number, String name)
	{
		super(number, name);
	}
	
	public void flareBlitz()
	{
		System.out.println("");
	}
	
	public void fireBlast()
	{
		System.out.println("");
	}
}
