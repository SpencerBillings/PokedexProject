package pokemon.model.monsters;

import pokemon.model.types.*;

public class Vulpix extends Pokemon implements Fire
{
	public Vulpix()
	{
		super(37, "Vulpix");
	}
	
	public Vulpix(String name)
	{
		super(37, name);
	}
	
	public Vulpix(int number, String name)
	{
		super(number, name);
	}
	
	public void flamethrower()
	{
		System.out.println("");
	}
	
	public void fireBlast()
	{
		System.out.println("");
	}
}
